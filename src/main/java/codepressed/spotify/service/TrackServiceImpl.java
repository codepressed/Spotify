package codepressed.spotify.service;

import codepressed.spotify.model.Track;
import codepressed.spotify.repository.TrackRepository;

public class TrackServiceImpl implements TrackService{

    private final TrackRepository trackRepository;

    public TrackServiceImpl(TrackRepository trackRepository){
        this.trackRepository = trackRepository;
    }

    @Override
    public void save(Track track) {
        trackRepository.save(track);
    }
}
