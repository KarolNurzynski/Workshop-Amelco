package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.entity.Bet;
import pl.coderslab.entity.BetOffer;

public interface BetRepository extends JpaRepository<Bet,Long> {


}
