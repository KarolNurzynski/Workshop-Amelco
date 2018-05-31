package pl.coderslab.restController;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.entity.League;
import pl.coderslab.service.LeagueService;

import java.util.List;

@RestController
@RequestMapping("/api/leagues")
public class LeagueRestController {

    @Autowired
    LeagueService leagueService;

    @GetMapping("/")
    public List<League> listOfLeagues() {
        return leagueService.findAllLeagues();
    }

    @GetMapping("/{id}")
    public League getLeagueById(@PathVariable Long id) {
        return leagueService.findLeagueById(id);
    }
    
    @PostMapping("/")
    public void addLeague(@RequestBody League league)
    {
        leagueService.saveLeague(league);
    }

    @PutMapping("/{id}")
    public void editLeague(@RequestBody League league) {
        leagueService.editLeague(league);
    }


    @DeleteMapping("/{id}")
    public void deleteLeague(@PathVariable Long id) {
        leagueService.deleteLeague(id);
    }


}
