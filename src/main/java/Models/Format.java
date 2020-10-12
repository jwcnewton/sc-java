package Models;

public class Format {
    private String protocol;
    private String mime_type;


    // Getter Methods

    public String getProtocol() {
        return protocol;
    }

    public String getMime_type() {
        return mime_type;
    }

    // Setter Methods

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public void setMime_type(String mime_type) {
        this.mime_type = mime_type;
    }
}
