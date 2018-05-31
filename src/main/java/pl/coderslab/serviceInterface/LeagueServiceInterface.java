package pl.coderslab.serviceInterface;

import org.springframework.stereotype.Service;
import pl.coderslab.entity.League;

import java.util.List;

@Service
public interface LeagueServiceInterface {

    public List<League> findAllLeagues();

    public League findLeagueById(Long id);

    public League saveLeague(League league);

    public League editLeague(League league);

    public void deleteLeague(League league);

}
