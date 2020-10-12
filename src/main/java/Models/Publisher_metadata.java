package Models;

public class Publisher_metadata {
    private float id;
    private String urn;
    private boolean contains_music;


    // Getter Methods

    public float getId() {
        return id;
    }

    public String getUrn() {
        return urn;
    }

    public boolean getContains_music() {
        return contains_music;
    }

    // Setter Methods

    public void setId(float id) {
        this.id = id;
    }

    public void setUrn(String urn) {
        this.urn = urn;
    }

    public void setContains_music(boolean contains_music) {
        this.contains_music = contains_music;
    }
}
