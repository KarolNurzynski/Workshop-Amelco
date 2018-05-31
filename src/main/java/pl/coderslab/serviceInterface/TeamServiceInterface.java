package pl.coderslab.serviceInterface;

import org.springframework.stereotype.Service;
import pl.coderslab.entity.Team;

import java.util.List;

@Service
public interface TeamServiceInterface {

    public List<Team> findAllTeams();

    public Team findTeamById(Long id);

    public Team saveTeam(Team team);

    public Team editTeam(Team team);

    public void deleteTeam(Long id);

}
