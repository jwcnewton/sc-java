package Models;

public class LikedTrack {
    private String created_at;
    private String kind;
    Track track;


    // Getter Methods

    public String getCreated_at() {
        return created_at;
    }

    public String getKind() {
        return kind;
    }

    public Track getTrack() {
        return track;
    }

    // Setter Methods

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void setTrack(Track track) {
        this.track = track;
    }
}
