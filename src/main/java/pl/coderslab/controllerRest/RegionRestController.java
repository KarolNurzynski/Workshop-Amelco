package pl.coderslab.controllerRest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.entity.Region;
import pl.coderslab.service.RegionService;

import java.util.List;

@RestController
@RequestMapping("/api/regions")
public class RegionRestController {

    @Autowired
    RegionService regionService;

    @GetMapping("/")
    public List<Region> listOfRegions() {
        return regionService.findAllRegions();
    }

    @GetMapping("/{id}")
    public Region getRegionById(@PathVariable Long id) {
        return regionService.findRegionById(id);
    }
    
    @PostMapping("/")
    public void addRegion(@RequestBody Region region)
    {
        regionService.saveRegion(region);
    }

    @PutMapping("/{id}")
    public void editRegion(@RequestBody Region region) {
        regionService.editRegion(region);
    }


    @DeleteMapping("/{id}")
    public void deleteRegion(@PathVariable Long id) {
        regionService.deleteRegion(id);
    }


}
