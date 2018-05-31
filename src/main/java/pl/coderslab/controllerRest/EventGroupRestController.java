package pl.coderslab.controllerRest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.entity.EventGroup;
import pl.coderslab.service.EventGroupService;

import java.util.List;

@RestController
@RequestMapping("/api/eventGroups")
public class EventGroupRestController {

    @Autowired
    EventGroupService eventGroupService;

    @GetMapping("/")
    public List<EventGroup> listOfEventGroups() {
        return eventGroupService.findAllEventGroups();
    }

    @GetMapping("/{id}")
    public EventGroup getEventGroupById(@PathVariable Long id) {
        return eventGroupService.findEventGroupById(id);
    }
    
    @PostMapping("/")
    public void addEventGroup(@RequestBody EventGroup eventGroup)
    {
        eventGroupService.saveEventGroup(eventGroup);
    }

    @PutMapping("/{id}")
    public void editEventGroup(@RequestBody EventGroup eventGroup) {
        eventGroupService.editEventGroup(eventGroup);
    }


    @DeleteMapping("/{id}")
    public void deleteEventGroup(@PathVariable Long id) {
        eventGroupService.deleteEventGroup(id);
    }


}
