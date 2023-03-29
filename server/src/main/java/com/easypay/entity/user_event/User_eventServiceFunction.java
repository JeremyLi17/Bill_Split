package com.easypay.entity.user_event;

import com.easypay.entity.Event.Event;
import com.easypay.entity.Event.EventRepoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class User_eventServiceFunction {
    private final User_eventRepoInterface userEventRepoInterface;
    private final EventRepoInterface eventRepoInterface;

    @Autowired
    public User_eventServiceFunction(
            User_eventRepoInterface userEventRepoInterface,
            EventRepoInterface eventRepoInterface
    ) {
        this.userEventRepoInterface = userEventRepoInterface;
        this.eventRepoInterface = eventRepoInterface;
    }


    public User_event createUser_event(Long userid, Long eventid) {
        User_event userEvent = new User_event();
        Optional<Event> event= eventRepoInterface.findById(eventid);
        userEvent.setEvent(event.get());
        userEventRepoInterface.save(userEvent);
        return userEvent;
    }
    public Optional<User_event> getUser_eventByUserId(Long userid){
        return userEventRepoInterface.findById(userid);}

    public Optional<User_event> getUser_eventByEventId(Long eventid){
        return userEventRepoInterface.findById(eventid);}

    public void deleteUser_Event(Long userid, Long eventid){eventRepoInterface.deleteById(eventid);};
}
