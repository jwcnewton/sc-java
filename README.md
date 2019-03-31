# sc-java
Java port of https://github.com/jwcnewton/sc-node

## Usage

Getting user details
```java
String clientId = "";
String userName = "newtnn";

SoundcloudScrapper scs = new SoundcloudScrapper(clientId);

UserModel user = scs.GetUserDetails(userName);

System.out.println(user.username);
```

Getting all users likes
```java
String clientId = "";
String userName = "newtnn";

SoundcloudScrapper scs = new SoundcloudScrapper(clientId);

UserModel likes = scs.GetUsersLikes(userName);

System.out.println(likes.size());
```

Getting tracks in a playlist
```java
String clientId = "";
String playlistUri = "https://soundcloud.com/newtnn/sets/thick-mix";

SoundcloudScrapper scs = new SoundcloudScrapper(clientId);

UserModel playlist = scs.GetPlaylistTracks(playlistUri);

System.out.println(playlist.tracks.size());
```

Downloading the latest liked track
```java
String clientId = "";
String userName = "newtnn";
String outputFolder = "/users/test/Documents/music";

SoundcloudScrapper scs = new SoundcloudScrapper(clientId);

UserModel likes = scs.GetUsersLikes(userName);

StreamService streamService = new StreamService(clientId);

streamService.ParseUrlStreamToFile(likes.get(0), outputFolder);
```

## Dependancies
[Google Rest Client](https://developers.google.com/api-client-library/java/google-http-java-client/)
