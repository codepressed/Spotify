package codepressed.spotify.service;

import codepressed.spotify.model.Playlist;
import codepressed.spotify.model.User;

import java.util.List;

public interface PlaylistService {
    Playlist save(Playlist playlist);
    List<Playlist> findAll();
}
