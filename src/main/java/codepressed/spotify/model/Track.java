package codepressed.spotify.model;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Track {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Long duration;

    public Track(String name, Long duration, String description) {
        this.name = name;
        this.duration = duration;
        this.description = description;
    }
}
