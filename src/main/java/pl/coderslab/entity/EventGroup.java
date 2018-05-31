package pl.coderslab.entity;


import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name="eventGroup")
@Data
public class EventGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "eventGroup")
    private List<Event> events;

    @OneToMany(mappedBy = "eventGroup")
    private List<BetOfferType> betOfferTypes;


}
