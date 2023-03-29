package com.easypay.entity.activity;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class ActivityService {
    private final ActivityRepo activityRepo;
    private final EventRepo eventRepo;

    @Autowired
    public ActivityService(ActivityRepo activityRepo, EventRepo eventRepo) {
        this.activityRepo = activityRepo;
        this.eventRepo = eventRepo;
    }

    public Activity addActivity(String name, String type, String eventName) {

        Activity activity = new Activity();
        Optional<Event> eventOpt = eventRepo.findEventByName(eventName);
        activity.setEvent(eventOpt.get());
        activity.setName(name);
        activity.setType(type);
        activityRepo.save(activity);
        return activity;
    }
    public List<Activity> findAllActivitiesByType(String type){
        return activityRepo.findActivitiesByType(type);

    }
    public List<Activity> findAllActivitiesByEventName(String eventName){activityRepo.
        return activityRepo.findAllActivitiesByEventName(eventName);

    }

    public void deleteActivity(Long id) {
        activityRepo.deleteById(id);
    }





}
