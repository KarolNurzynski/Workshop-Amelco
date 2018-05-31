package pl.coderslab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.coderslab.entity.Sport;
import pl.coderslab.repository.SportRepository;
import pl.coderslab.serviceInterface.SportServiceInterface;

import java.util.List;

@Service
public class SportService implements SportServiceInterface {

    SportRepository sportRepository;

    @Autowired
    SportService(SportRepository sportRepository) {
        this.sportRepository=sportRepository;
    }

    public List<Sport> findAllSports() {
        return sportRepository.findAll();
    }

    public Sport findSportById(Long id) {
        return sportRepository.findById(id).orElseGet(null);
    }

    public Sport saveSport(Sport sport) {
        return sportRepository.save(sport);
    }

    public Sport editSport(Sport sport) {
        return sportRepository.save(sport);
    }

    public void deleteSport(Long id) {
        sportRepository.deleteById(id);
    }

}
