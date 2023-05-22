package codepressed.spotify.service.impl;

import codepressed.spotify.model.Track;
import codepressed.spotify.repository.TrackRepository;
import codepressed.spotify.service.TrackService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrackServiceImpl implements TrackService {

    private final TrackRepository trackRepository;

    public TrackServiceImpl(TrackRepository trackRepository){
        this.trackRepository = trackRepository;
    }

    @Override
    public List<Track> findAll() {
        return trackRepository.findAll();
    }

    @Override
    public Track save(Track track) {
        return trackRepository.save(track);
    }
}
