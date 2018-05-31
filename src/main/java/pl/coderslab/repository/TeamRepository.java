package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.entity.Team;
import pl.coderslab.entity.User;

public interface TeamRepository extends JpaRepository<Team,Long> {


}
