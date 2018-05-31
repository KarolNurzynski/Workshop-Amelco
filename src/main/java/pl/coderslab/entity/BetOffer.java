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

    private Integer betOfferStatus;  //-1: not active / 0: finished / 1: active

    private LocalDateTime published;    //not active = null / published = datetime

    private LocalDateTime finished;

    @ManyToOne
    @JoinColumn(name = "betOfferType_id")
    private BetOfferType betOfferType;

    @OneToMany(mappedBy = "betOffer")
    private List<Bet> bets;


}
