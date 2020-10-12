package Models;

public class Transcoding {
    private String url;
    private String preset;
    private float duration;
    private boolean snipped;
    Format FormatObject;
    private String quality;


    // Getter Methods

    public String getUrl() {
        return url;
    }

    public String getPreset() {
        return preset;
    }

    public float getDuration() {
        return duration;
    }

    public boolean getSnipped() {
        return snipped;
    }

    public Format getFormat() {
        return FormatObject;
    }

    public String getQuality() {
        return quality;
    }

    // Setter Methods

    public void setUrl(String url) {
        this.url = url;
    }

    public void setPreset(String preset) {
        this.preset = preset;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    public void setSnipped(boolean snipped) {
        this.snipped = snipped;
    }

    public void setFormat(Format formatObject) {
        this.FormatObject = formatObject;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }
}
