package Models;

import com.google.api.client.util.Key;

import java.util.List;

public class UserModel {
    @Key
    public Integer id;
    @Key
    public String kind;
    @Key
    public String permalink;
    @Key
    public String username;
    @Key
    public String lastModified;
    @Key
    public String uri;
    @Key
    public String permalinkUrl;
    @Key
    public String avatarUrl;
    @Key
    public String country;
    @Key
    public String firstName;
    @Key
    public String lastName;
    @Key
    public String fullName;
    @Key
    public String description;
    @Key
    public String city;
    @Key
    public String discogsName;
    @Key
    public String myspaceName;
    @Key
    public String website;
    @Key
    public String websiteTitle;
    @Key
    public Integer trackCount;
    @Key
    public Integer playlistCount;
    @Key
    public Boolean online;
    @Key
    public String plan;
    @Key
    public Integer publicFavoritesCount;
    @Key
    public Integer followersCount;
    @Key
    public Integer followingsCount;
    @Key
    public List<String> subscriptions = null;
    @Key
    public Integer likesCount;
    @Key
    public Integer repostsCount;
    @Key
    public Integer commentsCount;
}
