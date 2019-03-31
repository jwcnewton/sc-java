package Utils;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.gson.Gson;
import java.lang.reflect.Type;

public class NetworkAdaptor {
    private static NetworkAdaptor ourInstance = new NetworkAdaptor();

    private static final HttpTransport HTTP_TRANSPORT = new NetHttpTransport();

    private static final Gson GSON_Parser = new Gson();

    public static NetworkAdaptor getInstance() {
        return ourInstance;
    }

    private NetworkAdaptor() {}

    public Object getRequest(String reqUrl, Type parseAs) throws Exception {
        GenericUrl url = new GenericUrl(reqUrl);

        HttpRequest request = HTTP_TRANSPORT.createRequestFactory().buildGetRequest(url);
        HttpResponse response = request.execute();

        if(response.getStatusCode() != 200) {
            throw new Exception("Request failed");
        }
        String res = response.parseAsString();

        Object result = GSON_Parser.fromJson(res, parseAs);

        response.disconnect();

        return result;
    }
}
