package codepressed.spotify.controller;


import codepressed.spotify.model.Playlist;
import codepressed.spotify.model.Track;
import codepressed.spotify.repository.PlaylistRepository;
import codepressed.spotify.repository.TrackRepository;
import codepressed.spotify.repository.UserRepository;
import codepressed.spotify.service.TrackService;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TrackController {

    private final TrackService trackService;
    private final PlaylistRepository playlistRepository;
    private final UserRepository userRepository;

    public TrackController(TrackService trackService, PlaylistRepository playlistRepository, UserRepository userRepository){
        this.trackService = trackService;
        this.playlistRepository = playlistRepository;
        this.userRepository = userRepository;

        Track track1 = new Track("Vuela conmigo", 200L, "Moderno");
        Track track2 = new Track("Vuela conmigo", 200L, "Moderno");
        Track track3 = new Track("Vuela conmigo", 200L, "Moderno");

        trackService.save(track1);
        trackService.save(track2);
        trackService.save(track3);

        List<Track> tracks = Arrays.asList(track1, track2, track3);

        Playlist playlist = new Playlist("Primera playlist", "Descripcion playlist", true, tracks);
        playlistRepository.save(playlist);

    }
}


