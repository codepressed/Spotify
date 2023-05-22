package codepressed.spotify.service;


import codepressed.spotify.model.Playlist;
import codepressed.spotify.repository.PlaylistRepository;

public class PlaylistServiceImpl implements PlaylistService{

    private final PlaylistRepository playlistRepository;

    public PlaylistServiceImpl(PlaylistRepository playlistRepository){
        this.playlistRepository = playlistRepository;
    }

    @Override
    public Playlist save(Playlist playlist) {
        return playlistRepository.save(playlist);
    }
}
