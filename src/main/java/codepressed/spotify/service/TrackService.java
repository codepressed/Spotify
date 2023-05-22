package codepressed.spotify.service;

import codepressed.spotify.model.Track;

import java.util.List;

public interface TrackService {
    List<Track> findAll();
    Track save(Track track);
}
