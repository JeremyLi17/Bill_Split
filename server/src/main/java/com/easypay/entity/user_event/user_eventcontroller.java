package com.easypay.entity.user_event;
import com.easypay.entity.Event.Event;
import com.easypay.entity.Event.EventServiceFunction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/user_event")
public class user_eventcontroller {
    @Autowired
    public user_eventcontroller(User_eventServiceFunction user_eventServiceFunction) {
        this.user_eventServiceFunction = user_eventServiceFunction;
    }

    private final User_eventServiceFunction user_eventServiceFunction;
    @GetMapping(path = "/{userid}")
    public ResponseEntity<User_event> getUser_EventByUserId(@PathVariable Long userid){
        User_event newUser_event = user_eventServiceFunction.getUser_eventByUserId(userid).get();
        return new ResponseEntity<>(newUser_event, HttpStatus.CREATED);
    }

    @GetMapping(path = "/{eventid}")
    public ResponseEntity<User_event> getUser_EventByEventId(@PathVariable Long eventid){
        User_event newUser_event = user_eventServiceFunction.getUser_eventByEventId(eventid).get();
        return new ResponseEntity<>(newUser_event, HttpStatus.CREATED);
    }

    // '/api/events/1'
    @PostMapping(path = "/")
    public ResponseEntity<User_event> createUser_Event(@RequestBody User_event user_event){

        User_event newUser_Event= User_eventServiceFunction.createUser_event(user_event.getUser().getId(), user_event.getEvent().getId());
        return new ResponseEntity<>(newUser_Event, HttpStatus.CREATED);}

    @DeleteMapping(path = "/delete")
    public void deleteUser_Event(@RequestParam Long userid, @RequestParam Long eventid){
            User_eventServiceFunction.deleteUser_Event(userid, eventid);

    }
}

