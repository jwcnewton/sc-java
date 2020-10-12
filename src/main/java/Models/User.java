package Models;

public class User {
    private String avatar_url;
    private String first_name;
    private String full_name;
    private float id;
    private String kind;
    private String last_modified;
    private String last_name;
    private String permalink;
    private String permalink_url;
    private String uri;
    private String urn;
    private String username;
    private boolean verified;
    private String city;
    private String country_code;
    Badges BadgesObject;


    // Getter Methods

    public String getAvatar_url() {
        return avatar_url;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getFull_name() {
        return full_name;
    }

    public float getId() {
        return id;
    }

    public String getKind() {
        return kind;
    }

    public String getLast_modified() {
        return last_modified;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getPermalink() {
        return permalink;
    }

    public String getPermalink_url() {
        return permalink_url;
    }

    public String getUri() {
        return uri;
    }

    public String getUrn() {
        return urn;
    }

    public String getUsername() {
        return username;
    }

    public boolean getVerified() {
        return verified;
    }

    public String getCity() {
        return city;
    }

    public String getCountry_code() {
        return country_code;
    }

    public Badges getBadges() {
        return BadgesObject;
    }

    // Setter Methods

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public void setId(float id) {
        this.id = id;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void setLast_modified(String last_modified) {
        this.last_modified = last_modified;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    public void setPermalink_url(String permalink_url) {
        this.permalink_url = permalink_url;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public void setUrn(String urn) {
        this.urn = urn;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }

    public void setBadges(Badges badgesObject) {
        this.BadgesObject = badgesObject;
    }
}
