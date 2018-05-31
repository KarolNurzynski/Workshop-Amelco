package pl.coderslab.serviceInterface;

import org.springframework.stereotype.Service;
import pl.coderslab.entity.Sport;

import java.util.List;

@Service
public interface SportServiceInterface {

    public List<Sport> findAllSports();

    public Sport findSportById(Long id);

    public Sport saveSport(Sport sport);

    public Sport editSport(Sport sport);

    public void deleteSport(Long id);

}
