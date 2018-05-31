package pl.coderslab.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name="region")
@Data
public class Region {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @JsonIgnore
    @ManyToMany(mappedBy = "regions")
    private List<Sport> sports;

    @JsonIgnore
    @OneToMany(mappedBy = "region")
    private List<League> leagues;

    //a team could be country (if region is "world" or "europe");
    // one team can play in different regions (like in national league
    // and championsleague; or like a tennis player who plays in national
    // league or in a world tennis cup)
    @JsonIgnore
    @ManyToMany
    private List<Team> teams;

    @JsonIgnore
    @OneToMany(mappedBy = "region")
    private List<Event> events;




}
