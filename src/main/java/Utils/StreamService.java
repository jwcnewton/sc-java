package Utils;

import Models.LikedTrack;
import com.google.gson.internal.LinkedTreeMap;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

public class StreamService {
    private String clientId;
    private String mimeType = "mp3";

    public StreamService(String client_Id) throws Exception {
        if(client_Id == null){
            throw new Exception("Client id cannot be null");
        }
        clientId = client_Id;
    }

    public void ParseUrlStreamToFile(LikedTrack track, String outLocation) throws Exception {
        String sanitizedTitle = StringSanitize.SanitizeString(track.getTrack().getTitle());

        final FileOutputStream fileOut = CreateOutFile(outLocation, sanitizedTitle);

        String trackResourceUri = String.format("%s?client_id=%s", track.getTrack().getMedia()
                .getTranscodings().get(1).getUrl(), clientId);


        LinkedTreeMap streamResource = (LinkedTreeMap) GetDownloadUri(trackResourceUri);

        final InputStream stream = CreateInStream(streamResource.get("url").toString());

        int currentBytePos;

        while ((currentBytePos = stream.read()) != -1) {
            fileOut.write(currentBytePos);
        }

        stream.close();
        fileOut.close();

        System.out.println("Downloaded: " + sanitizedTitle);
    }

    private FileOutputStream CreateOutFile(String outLocation, String sanitizedTitle) throws FileNotFoundException {
        String outFile = String.format("%s/%s.%s", outLocation, sanitizedTitle, mimeType);

        return new FileOutputStream(outFile);
    }

    private InputStream CreateInStream(String streamUrl) throws Exception {
        return new URL(streamUrl).openStream();
    }

    private Object GetDownloadUri(String uri) throws Exception {
        return NetworkAdaptor.getInstance().getRequest(uri, Object.class);
    }
}
