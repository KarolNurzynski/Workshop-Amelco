package pl.coderslab.entity;


import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name="betType")
@Data
public class BetType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private boolean team1Wins;

    private boolean team2Wins;

    private boolean team3Wins;

    private boolean draw;

    private Integer team1Score;

    private Integer team2Score;

    private Integer team3Score;

    private LocalTime team1TimeLessThan;

    private LocalTime team2TimeLessThan;

    private LocalTime team3TimeLessThan;

    @ManyToMany(mappedBy = "events")
    private List<EventDetail> eventDetails;

    @OneToMany(mappedBy = "betType")
    private List<BetOffer> betOffers;


}
