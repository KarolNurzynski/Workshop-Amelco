package pl.coderslab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.coderslab.entity.League;
import pl.coderslab.repository.LeagueRepository;
import pl.coderslab.serviceInterface.LeagueServiceInterface;

import java.util.List;

@Service
public class LeagueService implements LeagueServiceInterface {

    LeagueRepository leagueRepository;

    @Autowired
    LeagueService(LeagueRepository leagueRepository) {
        this.leagueRepository=leagueRepository;
    }

    public List<League> findAllLeagues() {
        return leagueRepository.findAll();
    }

    public League findLeagueById(Long id) {
        return leagueRepository.findById(id).orElseGet(null);
    }

    public League saveLeague(League league) {
        return leagueRepository.save(league);
    }

    public League editLeague(League league) {
        return leagueRepository.save(league);
    }

    public void deleteLeague(League league) {
        leagueRepository.delete(league);
    }

}
