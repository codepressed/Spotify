package codepressed.spotify.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Playlist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Boolean isPublic;

    @ManyToMany
    @OrderColumn
    private List<Track> tracks;

    @ManyToOne
    private User owner;

    public Playlist(String name, String description, Boolean isPublic, List<Track> tracks, User user) {
        this.name = name;
        this.description = description;
        this.isPublic = isPublic;
        this.owner = user;
    }
}
