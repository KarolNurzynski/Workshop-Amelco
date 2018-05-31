package pl.coderslab.restController;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.entity.EventDetail;
import pl.coderslab.service.EventDetailService;

import java.util.List;

@RestController
@RequestMapping("/api/eventDetails")
public class EventDetailRestController {

    @Autowired
    EventDetailService eventDetailService;

    @GetMapping("/")
    public List<EventDetail> listOfEventDetails() {
        return eventDetailService.findAllEventDetails();
    }

    @GetMapping("/{id}")
    public EventDetail getEventDetailById(@PathVariable Long id) {
        return eventDetailService.findEventDetailById(id);
    }
    
    @PostMapping("/")
    public void addEventDetail(@RequestBody EventDetail eventDetail)
    {
        eventDetailService.saveEventDetail(eventDetail);
    }

    @PutMapping("/{id}")
    public void editEventDetail(@RequestBody EventDetail eventDetail) {
        eventDetailService.editEventDetail(eventDetail);
    }


    @DeleteMapping("/{id}")
    public void deleteEventDetail(@PathVariable Long id) {
        eventDetailService.deleteEventDetail(id);
    }


}
