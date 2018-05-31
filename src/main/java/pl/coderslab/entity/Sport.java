package pl.coderslab.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="sport")
@Data
public class Sport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany
    @JsonIgnore
    private List<Region> regions;

    @OneToMany(mappedBy = "sport")
    @JsonIgnore
    private List<League> leagues;

    @OneToMany(mappedBy = "sport")
    @JsonIgnore
    private List<Team> teams;

    @OneToMany(mappedBy = "sport")
    @JsonIgnore
    private List<Event> events;



}
