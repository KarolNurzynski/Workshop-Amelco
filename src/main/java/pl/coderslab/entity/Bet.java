package pl.coderslab.entity;


import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name="bet")
@Data
public class Bet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private BigDecimal stake = BigDecimal.valueOf(0);

    private BigDecimal maxUserWin;

    private BigDecimal maxUserLose;

    private BigDecimal probabilityUserWins;

    //This field can be calculated from published and cancelled + event finished field
//    private Integer betStatus = -1;  //-1: not active(cancelled) / 0: finished / 1: active

    private LocalDateTime created;  //not active = null / published or canceled = datetime

    private LocalDateTime cancelled;  //not cancelled = null / finished = datetime

    @ManyToOne
    @JoinColumn(name = "betOffer_id")
    private BetOffer betOffer;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


}
