package pl.coderslab.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="league")
@Data
public class League {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "sport_id")
    @JsonIgnore
    private Sport sport;

    @ManyToOne
    @JoinColumn(name = "region_id")
    @JsonIgnore
    private Region region;

    @ManyToMany
    @JsonIgnore
    private List<Team> teams;

    @OneToMany(mappedBy = "league")
    @JsonIgnore
    private List<Event> events;


}
