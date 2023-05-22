package codepressed.spotify.controller;

import codepressed.spotify.model.Playlist;
import codepressed.spotify.model.User;
import codepressed.spotify.service.PlaylistService;
import codepressed.spotify.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlaylistController {

    private final PlaylistService playlistService;

    public PlaylistController(PlaylistService playlistService){
        this.playlistService = playlistService;
    }

    @GetMapping("/playlists")
    public List<Playlist> getAllPlaylists(){
        return playlistService.findAll();
    }

    @PostMapping("/playlists/add")
    public Playlist createPlaylist(@RequestBody Playlist playlist){
        return playlistService.save(playlist);
    }
}
