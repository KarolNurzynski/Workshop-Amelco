package pl.coderslab.controllerRest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.entity.Sport;
import pl.coderslab.service.SportService;

import java.util.List;

@RestController
@RequestMapping("/api/sports")
public class SportRestController {

    @Autowired
    SportService sportService;

    @GetMapping("/")
    public List<Sport> listOfSports() {
        return sportService.findAllSports();
    }

    @GetMapping("/{id}")
    public Sport getSportById(@PathVariable Long id) {
        return sportService.findSportById(id);
    }
    
    @PostMapping("/")
    public void addSport(@RequestBody Sport sport)
    {
        sportService.saveSport(sport);
    }

    @PutMapping("/{id}")
    public void editSport(@RequestBody Sport sport) {
        sportService.editSport(sport);
    }


    @DeleteMapping("/{id}")
    public void deleteSport(@PathVariable Long id) {
        sportService.deleteSport(id);
    }


}
