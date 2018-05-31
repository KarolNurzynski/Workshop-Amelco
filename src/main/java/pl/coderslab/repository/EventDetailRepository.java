package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.entity.EventDetail;
import pl.coderslab.entity.League;

public interface EventDetailRepository extends JpaRepository<EventDetail,Long> {


}
