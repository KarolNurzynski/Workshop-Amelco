package pl.coderslab.serviceInterface;

import org.springframework.stereotype.Service;
import pl.coderslab.entity.EventDetail;

import java.util.List;

@Service
public interface EventDetailServiceInterface {

    public List<EventDetail> findAllEventDetails();

    public EventDetail findEventDetailById(Long id);

    public EventDetail saveEventDetail(EventDetail eventDetail);

    public EventDetail editEventDetail(EventDetail eventDetail);

    public void deleteEventDetail(EventDetail eventDetail);

}
