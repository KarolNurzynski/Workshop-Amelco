package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.entity.Sport;
import pl.coderslab.entity.Team;

public interface SportRepository extends JpaRepository<Sport,Long> {


}
