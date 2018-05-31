package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.entity.EventGroup;
import pl.coderslab.entity.Sport;

public interface EventGroupRepository extends JpaRepository<EventGroup,Long> {


}
