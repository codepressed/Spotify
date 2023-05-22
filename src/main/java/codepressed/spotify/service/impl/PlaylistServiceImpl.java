package codepressed.spotify.service.impl;


import codepressed.spotify.model.Playlist;
import codepressed.spotify.repository.PlaylistRepository;
import codepressed.spotify.service.PlaylistService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaylistServiceImpl implements PlaylistService {

    private final PlaylistRepository playlistRepository;

    public PlaylistServiceImpl(PlaylistRepository playlistRepository){
        this.playlistRepository = playlistRepository;
    }

    @Override
    public Playlist save(Playlist playlist) {
        return playlistRepository.save(playlist);
    }

    @Override
    public List<Playlist> findAll() {
        return playlistRepository.findAll();
    }
}
