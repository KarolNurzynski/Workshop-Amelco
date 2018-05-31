package pl.coderslab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.coderslab.entity.EventGroup;
import pl.coderslab.repository.EventGroupRepository;
import pl.coderslab.serviceInterface.EventGroupServiceInterface;

import java.util.List;

@Service
public class EventGroupService implements EventGroupServiceInterface {

    EventGroupRepository eventGroupRepository;

    @Autowired
    EventGroupService(EventGroupRepository eventGroupRepository) {
        this.eventGroupRepository=eventGroupRepository;
    }

    public List<EventGroup> findAllEventGroups() {
        return eventGroupRepository.findAll();
    }

    public EventGroup findEventGroupById(Long id) {
        return eventGroupRepository.findById(id).orElseGet(null);
    }

    public EventGroup saveEventGroup(EventGroup eventGroup) {
        return eventGroupRepository.save(eventGroup);
    }

    public EventGroup editEventGroup(EventGroup eventGroup) {
        return eventGroupRepository.save(eventGroup);
    }

    public void deleteEventGroup(Long id) {
        eventGroupRepository.deleteById(id);
    }

}
