package com.easypay.entity.activity;

import com.easypay.entity.Event.Event;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity

public class Activity {
    @Id
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "ACTIVITY_SEQUENCE"
    )
    @SequenceGenerator(
            name = "ACTIVITY_SEQUENCE",
            sequenceName = "ACTIVITY_SEQUENCE",
            initialValue = 1,
            allocationSize = 1)
    @Column(name = "ACTIVITY_ID", nullable = false)
    private Long id;
    @Column(name = "ACTIVITY_NAME", nullable = false, length = 30)
    private String name;
    @Column(name = "ACTIVITY_TYPE", nullable = true, length = 30)
    private String type;


    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "EVENT_ID", nullable = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Event event;



    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Activity() {
    }

    public Activity(Long id, String name, String type, Event event) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.event = event;
    }



    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }



}
