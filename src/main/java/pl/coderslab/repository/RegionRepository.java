package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.entity.Region;
import pl.coderslab.entity.Sport;

public interface RegionRepository extends JpaRepository<Region,Long> {


}
