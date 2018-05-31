package pl.coderslab.controllerRest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.entity.Team;
import pl.coderslab.service.TeamService;

import java.util.List;

@RestController
@RequestMapping("/api/teams")
public class TeamRestController {

    @Autowired
    TeamService teamService;

    @GetMapping("/")
    public List<Team> listOfTeams() {
        return teamService.findAllTeams();
    }

    @GetMapping("/{id}")
    public Team getTeamById(@PathVariable Long id) {
        return teamService.findTeamById(id);
    }
    
    @PostMapping("/")
    public void addTeam(@RequestBody Team team)
    {
        teamService.saveTeam(team);
    }

    @PutMapping("/{id}")
    public void editTeam(@RequestBody Team team) {
        teamService.editTeam(team);
    }


    @DeleteMapping("/{id}")
    public void deleteTeam(@PathVariable Long id) {
        teamService.deleteTeam(id);
    }


}
