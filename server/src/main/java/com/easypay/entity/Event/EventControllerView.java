package com.easypay.entity.Event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/events")
public class EventControllerView {
    @Autowired
    public EventControllerView(EventServiceFunction eventServiceFunction) {
        this.eventServiceFunction = eventServiceFunction;
    }

    private final EventServiceFunction eventServiceFunction;

    // '/api/events/1'
    @GetMapping(path = "/{id}")
    public ResponseEntity<Event> getEvent(@PathVariable Long id){
        Event newEvent = eventServiceFunction.getEvent(id).get();
        return new ResponseEntity<>(newEvent, HttpStatus.CREATED);
    }

    @PostMapping(path = "/")
    public ResponseEntity<Event> createEvent(@RequestBody Event event){

        Event newEvent = eventServiceFunction.createEvent(event.getName(), event.getStart_date(), event.getEnd_date());
        return new ResponseEntity<>(newEvent, HttpStatus.CREATED);
    }

    @PutMapping("/update") // /api/events/update
    public ResponseEntity<Event> updateEvent(@RequestParam Long id, @RequestParam(required = false) String event_name,
                                             @RequestParam(required = false) Date start_date, @ RequestParam(required = false) Date end_date){
        Optional<Event> newEvent = eventServiceFunction.updateEvent(id,event_name, start_date, end_date);
        Event event = newEvent.get();
        return new ResponseEntity<>(event, HttpStatus.ACCEPTED);
    }

    @DeleteMapping(path = "/delete")
    public void deleteEvent(@RequestParam Long id){
        eventServiceFunction.deleteEvent(id);
    }
}
