package pl.coderslab.entity;


import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name="betOfferType")
@Data
public class BetOfferType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    //it is not the same as sport - we can have various sets of bet types for different leagues e.g. fotball-standard; football-championsleague
    @ManyToOne
    @JoinColumn(name = "eventGroup_id")
    private EventGroup eventGroup;

    @OneToMany(mappedBy = "betOfferType")
    private List<BetOffer> betOffers;

//    @ManyToMany(mappedBy = "events")
//    private List<EventDetail> eventDetails;
//



}
