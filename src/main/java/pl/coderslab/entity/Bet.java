package pl.coderslab.entity;


import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name="bet")
@Data
public class Bet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private BigDecimal stake;

    private BigDecimal maxUserWin;

    private BigDecimal maxUserLose;

    private BigDecimal probabilityUserWins;

    @ManyToOne
    @JoinColumn(name = "betOffer_id")
    private BetOffer betOffer;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;

}
