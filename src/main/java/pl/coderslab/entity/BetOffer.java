package pl.coderslab.entity;


import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name="betOffer")
@Data
public class BetOffer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private BigDecimal odds;

    // I will not use the below as not to duplicate data and avoid data inconsistency
//    private Integer betOfferStatus;  //-1: not active / 0: finished / 1: active

    private LocalDateTime published;    //not active = null / active or finished = datetime

    private LocalDateTime finished; //active or not active = null / finished = datetime

    @ManyToOne
    @JoinColumn(name = "betOfferType_id")
    private BetOfferType betOfferType;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;

    @OneToMany(mappedBy = "betOffer")
    private List<Bet> bets;




}
