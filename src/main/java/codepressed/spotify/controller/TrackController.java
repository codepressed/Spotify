package codepressed.spotify.controller;


import codepressed.spotify.model.Playlist;
import codepressed.spotify.model.Track;
import codepressed.spotify.model.User;
import codepressed.spotify.repository.PlaylistRepository;
import codepressed.spotify.repository.TrackRepository;
import codepressed.spotify.repository.UserRepository;
import codepressed.spotify.service.PlaylistService;
import codepressed.spotify.service.TrackService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TrackController {

    private final TrackService trackService;
    private final PlaylistService playlistService;

    public TrackController(TrackService trackService, PlaylistService playlistService){
        this.trackService = trackService;
        this.playlistService = playlistService;
    }

    @GetMapping("/tracks")
    public List<Track> getAllTracks(){
        return trackService.findAll();
    }

    @PostMapping("track/add")
    public Track createTrack(@RequestBody Track track){
        return trackService.save(track);
    }
}


