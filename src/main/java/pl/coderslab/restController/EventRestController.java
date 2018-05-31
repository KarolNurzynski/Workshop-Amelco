package pl.coderslab.restController;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.coderslab.entity.Event;
import pl.coderslab.service.EventService;

import java.util.List;

@RestController
@RequestMapping("/api/events")
public class EventRestController {

    @Autowired
    EventService eventService;

    @GetMapping("/")
    public List<Event> listOfEvents() {
        return eventService.findAllEvents();
    }

}
