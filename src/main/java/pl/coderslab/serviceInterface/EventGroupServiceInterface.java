package pl.coderslab.serviceInterface;

import org.springframework.stereotype.Service;
import pl.coderslab.entity.EventGroup;

import java.util.List;

@Service
public interface EventGroupServiceInterface {

    public List<EventGroup> findAllEventGroups();

    public EventGroup findEventGroupById(Long id);

    public EventGroup saveEventGroup(EventGroup eventGroup);

    public EventGroup editEventGroup(EventGroup eventGroup);

    public void deleteEventGroup(Long id);

}
