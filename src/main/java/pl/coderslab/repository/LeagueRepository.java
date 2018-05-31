package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.entity.League;
import pl.coderslab.entity.Region;

public interface LeagueRepository extends JpaRepository<League,Long> {


}
