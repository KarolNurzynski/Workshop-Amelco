package pl.coderslab.entity;


import lombok.Data;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name="eventDetails")
@Data
public class EventDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer team1Score;

    private Integer team2Score;

    private Integer team3Score;

    private LocalTime team1Time;

    private LocalTime team2Time;

    private LocalTime team3Time;

    @ManyToMany
    private List<Event> events;

    @ManyToMany
    private List<BetOfferType> betOfferTypes;




}
