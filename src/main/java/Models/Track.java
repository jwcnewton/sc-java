package Models;

public class Track {
    private String artwork_url;
    private String caption = null;
    private boolean commentable;
    private float comment_count;
    private String created_at;
    private String description;
    private boolean downloadable;
    private float download_count;
    private float duration;
    private float full_duration;
    private String embeddable_by;
    private String genre;
    private boolean has_downloads_left;
    private float id;
    private String kind;
    private String label_name = null;
    private String last_modified;
    private String license;
    private float likes_count;
    private String permalink;
    private String permalink_url;
    private float playback_count;
    private String purchase_title = null;
    private String purchase_url = null;
    private String release_date = null;
    private float reposts_count;
    private String secret_token = null;
    private String sharing;
    private String state;
    private boolean streamable;
    private String tag_list;
    private String title;
    private String uri;
    private String urn;
    private float user_id;
    private String visuals = null;
    private String waveform_url;
    private String display_date;
    Media media;
    User User;


    // Getter Methods

    public String getArtwork_url() {
        return artwork_url;
    }

    public String getCaption() {
        return caption;
    }

    public boolean getCommentable() {
        return commentable;
    }

    public float getComment_count() {
        return comment_count;
    }

    public String getCreated_at() {
        return created_at;
    }

    public String getDescription() {
        return description;
    }

    public boolean getDownloadable() {
        return downloadable;
    }

    public float getDownload_count() {
        return download_count;
    }

    public float getDuration() {
        return duration;
    }

    public float getFull_duration() {
        return full_duration;
    }

    public String getEmbeddable_by() {
        return embeddable_by;
    }

    public String getGenre() {
        return genre;
    }

    public boolean getHas_downloads_left() {
        return has_downloads_left;
    }

    public float getId() {
        return id;
    }

    public String getKind() {
        return kind;
    }

    public String getLabel_name() {
        return label_name;
    }

    public String getLast_modified() {
        return last_modified;
    }

    public String getLicense() {
        return license;
    }

    public float getLikes_count() {
        return likes_count;
    }

    public String getPermalink() {
        return permalink;
    }

    public String getPermalink_url() {
        return permalink_url;
    }

    public float getPlayback_count() {
        return playback_count;
    }

    public String getPurchase_title() {
        return purchase_title;
    }

    public String getPurchase_url() {
        return purchase_url;
    }

    public String getRelease_date() {
        return release_date;
    }

    public float getReposts_count() {
        return reposts_count;
    }

    public String getSecret_token() {
        return secret_token;
    }

    public String getSharing() {
        return sharing;
    }

    public String getState() {
        return state;
    }

    public boolean getStreamable() {
        return streamable;
    }

    public String getTag_list() {
        return tag_list;
    }

    public String getTitle() {
        return title;
    }

    public String getUri() {
        return uri;
    }

    public String getUrn() {
        return urn;
    }

    public float getUser_id() {
        return user_id;
    }

    public String getVisuals() {
        return visuals;
    }

    public String getWaveform_url() {
        return waveform_url;
    }

    public String getDisplay_date() {
        return display_date;
    }

    public Media getMedia() {
        return media;
    }

    public User getUser() {
        return User;
    }

    // Setter Methods

    public void setArtwork_url(String artwork_url) {
        this.artwork_url = artwork_url;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public void setCommentable(boolean commentable) {
        this.commentable = commentable;
    }

    public void setComment_count(float comment_count) {
        this.comment_count = comment_count;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDownloadable(boolean downloadable) {
        this.downloadable = downloadable;
    }

    public void setDownload_count(float download_count) {
        this.download_count = download_count;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    public void setFull_duration(float full_duration) {
        this.full_duration = full_duration;
    }

    public void setEmbeddable_by(String embeddable_by) {
        this.embeddable_by = embeddable_by;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setHas_downloads_left(boolean has_downloads_left) {
        this.has_downloads_left = has_downloads_left;
    }

    public void setId(float id) {
        this.id = id;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void setLabel_name(String label_name) {
        this.label_name = label_name;
    }

    public void setLast_modified(String last_modified) {
        this.last_modified = last_modified;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public void setLikes_count(float likes_count) {
        this.likes_count = likes_count;
    }

    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    public void setPermalink_url(String permalink_url) {
        this.permalink_url = permalink_url;
    }

    public void setPlayback_count(float playback_count) {
        this.playback_count = playback_count;
    }

    public void setPurchase_title(String purchase_title) {
        this.purchase_title = purchase_title;
    }

    public void setPurchase_url(String purchase_url) {
        this.purchase_url = purchase_url;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public void setReposts_count(float reposts_count) {
        this.reposts_count = reposts_count;
    }

    public void setSecret_token(String secret_token) {
        this.secret_token = secret_token;
    }

    public void setSharing(String sharing) {
        this.sharing = sharing;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setStreamable(boolean streamable) {
        this.streamable = streamable;
    }

    public void setTag_list(String tag_list) {
        this.tag_list = tag_list;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public void setUrn(String urn) {
        this.urn = urn;
    }

    public void setUser_id(float user_id) {
        this.user_id = user_id;
    }

    public void setVisuals(String visuals) {
        this.visuals = visuals;
    }

    public void setWaveform_url(String waveform_url) {
        this.waveform_url = waveform_url;
    }

    public void setDisplay_date(String display_date) {
        this.display_date = display_date;
    }

    public void setMedia(Media media) {
        this.media = media;
    }

    public void setUser(User user) {
        this.User = user;
    }
}
