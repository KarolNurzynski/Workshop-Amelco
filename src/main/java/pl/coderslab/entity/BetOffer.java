package pl.coderslab.entity;


import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
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

    @ManyToOne
    @JoinColumn(name = "betType_id")
    private BetType betType;

    @OneToMany(mappedBy = "betOffer")
    private List<Bet> bets;


}
