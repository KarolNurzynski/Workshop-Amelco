package pl.coderslab.controllerRest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.entity.BetOfferType;
import pl.coderslab.service.BetOfferTypeService;

import java.util.List;

@RestController
@RequestMapping("/api/betOfferTypes")
public class BetOfferTypeRestController {

    @Autowired
    BetOfferTypeService betOfferTypeService;

    @GetMapping("/")
    public List<BetOfferType> listOfBetOfferTypes() {
        return betOfferTypeService.findAllBetOfferTypes();
    }

    @GetMapping("/{id}")
    public BetOfferType getBetOfferTypeById(@PathVariable Long id) {
        return betOfferTypeService.findBetOfferTypeById(id);
    }
    
    @PostMapping("/")
    public void addBetOfferType(@RequestBody BetOfferType betOfferType)
    {
        betOfferTypeService.saveBetOfferType(betOfferType);
    }

    @PutMapping("/{id}")
    public void editBetOfferType(@RequestBody BetOfferType betOfferType) {
        betOfferTypeService.editBetOfferType(betOfferType);
    }


    @DeleteMapping("/{id}")
    public void deleteBetOfferType(@PathVariable Long id) {
        betOfferTypeService.deleteBetOfferType(id);
    }


}
