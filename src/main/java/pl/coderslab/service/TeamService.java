package pl.coderslab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.coderslab.entity.Team;
import pl.coderslab.repository.TeamRepository;
import pl.coderslab.serviceInterface.TeamServiceInterface;

import java.util.List;

@Service
public class TeamService implements TeamServiceInterface {

    TeamRepository teamRepository;

    @Autowired
    TeamService(TeamRepository teamRepository) {
        this.teamRepository=teamRepository;
    }

    public List<Team> findAllTeams() {
        return teamRepository.findAll();
    }

    public Team findTeamById(Long id) {
        return teamRepository.findById(id).orElseGet(null);
    }

    public Team saveTeam(Team team) {
        return teamRepository.save(team);
    }

    public Team editTeam(Team team) {
        return teamRepository.save(team);
    }

    public void deleteTeam(Long id) {
        teamRepository.deleteById(id);
    }

}
