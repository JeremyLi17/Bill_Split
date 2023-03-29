package com.easypay.entity.activity;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static org.springframework.http.HttpStatus.*;

@RestController
@RequestMapping("/api/activity")
@AllArgsConstructor

public class ActivityController {
    private final ActivityService activityService;
    @PostMapping("/add")
    public ResponseEntity<Activity> addActivity(@RequestBody Activity activity)
    {
        activityService.addActivity(activity.getName(), activity.getType(), activity.getEvent().getName());
        return new ResponseEntity<>(activity, CREATED);
    }

    @GetMapping("/list/{type}")
    public ResponseEntity<List<Activity>> findAllActivitiesByType(
            @PathVariable("type") String type) {
        List<Activity> activities = activityService.findAllActivitiesByType(type);
        return new ResponseEntity<>(activities, OK);
    }
    @GetMapping("/list/{eventName}")
    public ResponseEntity<List<Activity>> findAllActivitiesByEventName(
            @PathVariable("eventName") String eventName) {
        List<Activity> activities = activityService.findAllActivitiesByEventName(eventName);
        return new ResponseEntity<>(activities, OK);
    }
    @DeleteMapping("/delete")
    public void deleteActivity(@RequestParam Long id)
    {
        activityService.deleteActivity(id);
    }








}
