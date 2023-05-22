package codepressed.spotify.controller;

import codepressed.spotify.model.Playlist;
import codepressed.spotify.model.User;
import codepressed.spotify.service.PlaylistService;
import codepressed.spotify.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/playlist")
public class PlaylistController {

    private final PlaylistService playlistService;

    public PlaylistController(PlaylistService playlistService){
        this.playlistService = playlistService;
    }

    @GetMapping("/all")
    public List<Playlist> getAllPlaylists(){
        return playlistService.findAll();
    }

    @PostMapping("/add")
    public Playlist createPlaylist(@RequestBody Playlist playlist){
        return playlistService.save(playlist);
    }
}
