package pl.coderslab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.coderslab.entity.EventDetail;
import pl.coderslab.repository.EventDetailRepository;
import pl.coderslab.serviceInterface.EventDetailServiceInterface;

import java.util.List;

@Service
public class EventDetailService implements EventDetailServiceInterface {
    
    EventDetailRepository eventDetailRepository;

    @Autowired
    EventDetailService(EventDetailRepository eventDetailRepository) {
        this.eventDetailRepository=eventDetailRepository;
    }

    public List<EventDetail> findAllEventDetails() {
        return eventDetailRepository.findAll();
    }

    public EventDetail findEventDetailById(Long id) {
        return eventDetailRepository.findById(id).orElseGet(null);
    }

    public EventDetail saveEventDetail(EventDetail eventDetail) {
        return eventDetailRepository.save(eventDetail);
    }

    public EventDetail editEventDetail(EventDetail eventDetail) {
        return eventDetailRepository.save(eventDetail);
    }

    public void deleteEventDetail(Long id) {
        eventDetailRepository.deleteById(id);
    }

}
