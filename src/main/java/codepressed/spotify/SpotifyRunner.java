package codepressed.spotify;

import codepressed.spotify.model.Playlist;
import codepressed.spotify.model.Track;
import codepressed.spotify.model.User;
import codepressed.spotify.service.PlaylistService;
import codepressed.spotify.service.TrackService;
import codepressed.spotify.service.UserService;
import org.springframework.boot.CommandLineRunner;

import java.util.Arrays;
import java.util.List;

public class SpotifyRunner implements CommandLineRunner {

    private final TrackService trackService;

    private final UserService userService;

    private final PlaylistService playlistService;

    public SpotifyRunner(TrackService trackService, UserService userService, PlaylistService playlistService) {
        this.trackService = trackService;
        this.userService = userService;
        this.playlistService = playlistService;
    }

    @Override
    public void run(String... args) throws Exception {
        Track track1 = new Track("Vuela conmigo", 200L, "Moderno");
        Track track2 = new Track("Vuela conmigo", 200L, "Moderno");
        Track track3 = new Track("Vuela conmigo", 200L, "Moderno");

        trackService.save(track1);
        trackService.save(track2);
        trackService.save(track3);

        User user1 = new User("Daniel", "Apesteguia", "donapesteguia@gmail.com");
        User user2 = new User("Daniel", "Rueda", "donrueda@gmail.com");
        userService.save(user1);

        List<Track> tracks = Arrays.asList(track1, track2, track3);
        Playlist playlist1 = new Playlist("Primera playlist", "Descripcion playlist", true, tracks, user1);
        Playlist playlist2 = new Playlist("Segunda playlist", "Descripcion playlist", true, tracks, user2);
        playlistService.save(playlist1);
        playlistService.save(playlist2);


    }
}
