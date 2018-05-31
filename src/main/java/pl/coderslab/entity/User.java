package pl.coderslab.entity;


import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name="user")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    //To moze byc potrzebne do subskrypcji, ale na razie olewam
//    @ManyToOne
//    @JoinColumn(name = "event_id")
//    private Event event;
//
    @OneToMany(mappedBy = "user")
    private List<Bet> bets;

}
