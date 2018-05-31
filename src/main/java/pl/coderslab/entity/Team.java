package pl.coderslab.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="team")
@Data
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "sport_id")
    @JsonIgnore
    private Sport sport;

    // one team can play at national level (e.g.Polish Football League) and internation level (ChampionsLeague)
    @ManyToMany(mappedBy = "teams")
    @JsonIgnore
    private List<Region> regions;

    // for example in tennis you can play in various cups
    @ManyToMany(mappedBy = "teams")
    @JsonIgnore
    private List<League> leagues;

    //horse race can have many teams (horses); not just 2
    @ManyToMany
    @JsonIgnore
    private List<Event> events;


}
