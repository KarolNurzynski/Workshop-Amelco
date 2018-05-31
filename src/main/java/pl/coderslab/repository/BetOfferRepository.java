package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.entity.BetOffer;
import pl.coderslab.entity.BetOfferType;

public interface BetOfferRepository extends JpaRepository<BetOffer,Long> {


}
