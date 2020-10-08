package Scrapper;

import Models.*;
import Utils.NetworkAdaptor;
import java.util.Arrays;
import java.util.List;

public class SoundcloudScrapper {
    private String soundcloudApiUri = "https://api-v2.soundcloud.com";
    private String playlistPlaceholder = "_playlist_";
    private String usernamePlaceholder = "_username_";
    private String limitPlaceholder = "_limit_";
    private String soundcloudApiUserUri;
    private String soundcloudApiUserLikes;
    private String soundcloudApiPlaylist;
    private int defaultLimit = 50;
    private NetworkAdaptor adaptor;

    public SoundcloudScrapper(String clientId) throws Exception {
        if(clientId == null){
            throw new Exception("Client id cannot be null");
        }

        soundcloudApiUserUri = String.format("%s/resolve?url=https://soundcloud.com/%s&client_id=%s",
                soundcloudApiUri, usernamePlaceholder, clientId);

        soundcloudApiUserLikes = String.format("%s/users/%s/favorites?limit=%s&format=json&client_id=%s",
                soundcloudApiUri, usernamePlaceholder, limitPlaceholder, clientId);

        soundcloudApiPlaylist = String.format("%s/resolve?url=%s?format=json&client_id=%s",
                soundcloudApiUri, playlistPlaceholder, clientId);

        adaptor = NetworkAdaptor.getInstance();
    }

    public UserModel GetUserDetails(String userName) throws Exception {
        String userProfileUri = soundcloudApiUserUri.replace(usernamePlaceholder, userName);

        return (UserModel) adaptor.getRequest(userProfileUri, UserModel.class);
    }

    public List<TracksModel> GetUsersLikes(String userName, int limit) throws Exception {
        String userLikesUri = soundcloudApiUserLikes
                .replace(usernamePlaceholder, userName)
                .replace(limitPlaceholder, Integer.toString(limit));
        TracksModel[] tracks = (TracksModel[]) adaptor.getRequest(userLikesUri, TracksModel[].class);
        return Arrays.asList(tracks);
    }

    public List<TracksModel> GetUsersLikes(String userName) throws Exception {
        return GetUsersLikes(userName, defaultLimit);
    }

    public PlaylistModel GetPlaylistTracks(String playlistName) throws Exception {
        String playlistUri = soundcloudApiPlaylist.replace(playlistPlaceholder, playlistName);
        return (PlaylistModel) adaptor.getRequest(playlistUri, PlaylistModel.class);
    }
}
