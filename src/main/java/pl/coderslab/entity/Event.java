package pl.coderslab.entity;


import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name="event")
@Data
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private LocalDateTime startDateTime;

    @ManyToOne
    @JoinColumn(name = "sport_id")
    private Sport sport;

    @ManyToOne
    @JoinColumn(name = "region_id")
    private Region region;

    @ManyToOne
    @JoinColumn(name = "league_id")
    private League league;

    @ManyToMany(mappedBy = "events")
    private List<Team> teams;

    @ManyToOne
    @JoinColumn(name = "eventGroup_id")
    private EventGroup eventGroup;

    @OneToMany(mappedBy = "event")
    private List<BetOffer> betOffers;

    @OneToMany(mappedBy = "event")
    private List<Bet> bets;


//    @ManyToMany
//    private List<EventDetail> eventDetails;



}
