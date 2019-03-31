package Models;

import com.google.api.client.util.Key;

public class TracksModel {
    @Key
    public String kind;
    @Key
    public Integer id;
    @Key
    public String createdAt;
    @Key
    public Integer userId;
    @Key
    public Integer duration;
    @Key
    public Boolean commentable;
    @Key
    public String state;
    @Key
    public Integer originalContentSize;
    @Key
    public String lastModified;
    @Key
    public String sharing;
    @Key
    public String tagList;
    @Key
    public String permalink;
    @Key
    public Boolean streamable;
    @Key
    public String embeddableBy;
    @Key
    public Boolean downloadable;
    @Key
    public String purchaseUrl;
    @Key
    public String labelId;
    @Key
    public String purchaseTitle;
    @Key
    public String genre;
    @Key
    public String title;
    @Key
    public String description;
    @Key
    public String labelName;
    @Key
    public String release;
    @Key
    public String trackType;
    @Key
    public String keySignature;
    @Key
    public String isrc;
    @Key
    public String videoUrl;
    @Key
    public String bpm;
    @Key
    public Integer releaseYear;
    @Key
    public Integer releaseMonth;
    @Key
    public Integer releaseDay;
    @Key
    public String originalFormat;
    @Key
    public String license;
    @Key
    public String uri;
    @Key
    public String stream_url;
    @Key
    public UserModel user;
}
