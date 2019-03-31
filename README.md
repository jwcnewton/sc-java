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

## Dependancies
[Google Rest Client](https://developers.google.com/api-client-library/java/google-http-java-client/)
