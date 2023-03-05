package com.easypay.entity.Event;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

//bean = 自动生成service 运行
@Service
@Slf4j
public class EventServiceFunction {
    @Autowired
    public EventServiceFunction(EventRepoInterface eventRepoInterface) {
        this.eventRepoInterface = eventRepoInterface;
    }

    private final EventRepoInterface eventRepoInterface;
    private final Logger logger = LoggerFactory.getLogger(getClass());
    public Event createEvent(String event_name, Date start_date, Date end_date) {
        logger.error(end_date.toString());
        Event event = new Event();
        event.setEvent_name(event_name);
        event.setStart_date(start_date);
        event.setEnd_date(end_date);
        eventRepoInterface.save(event);
        return event;
    }

    public Optional<Event> getEvent(Long id){
        return eventRepoInterface.findById(id);}

    public Optional<Event> updateEvent(Long id, String event_name,
                                       Date start_date, Date end_date)
    {
        Optional<Event> eventOpt = eventRepoInterface.findById(id);
        if (eventOpt.isEmpty()) {
            // handle later
        } else {
            Event event = eventOpt.get();

            if(event_name != null){
                event.setEvent_name(event_name);
            }
            if(start_date != null){
                event.setStart_date(start_date);
            }
            if(end_date != null){
                event.setEnd_date(end_date);
            }
            eventRepoInterface.save(event);
        }
        return eventOpt;
    }

    public void deleteEvent(Long id){eventRepoInterface.deleteById(id);}
}
