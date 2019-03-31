package Utils;

import Models.TracksModel;

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

    public void ParseUrlStreamToFile(TracksModel track, String outLocation) throws Exception {
        String sanitizedTitle = StringSanitize.SanitizeString(track.title);

        System.out.println(sanitizedTitle);

        final FileOutputStream fileOut = CreateOutFile(outLocation, sanitizedTitle);

        final InputStream stream = CreateInStream(track.stream_url);

        int currentBytePos;

        while ((currentBytePos = stream.read()) != -1) {
            fileOut.write(currentBytePos);
        }

        stream.close();
        fileOut.close();
    }

    private FileOutputStream CreateOutFile(String outLocation, String sanitizedTitle) throws FileNotFoundException {
        String outFile = String.format("%s/%s.%s", outLocation, sanitizedTitle, mimeType);

        return new FileOutputStream(outFile);
    }

    private InputStream CreateInStream(String streamUrl) throws Exception {
        String formattedUri = String.format("%s?client_id=%s", streamUrl, clientId);

        return new URL(formattedUri).openStream();
    }
}
