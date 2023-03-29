package com.easypay.entity.user_event;

import com.easypay.entity.Event.Event;
import com.easypay.entity.user.User;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
public class User_event {

    @Id
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "USER_EVENT_SEQUENCE"
    )
    @SequenceGenerator(
            name = "USER_EVENT_SEQUENCE",
            sequenceName = "USER_EVENT_SEQUENCE",
            initialValue = 1,
            allocationSize = 1)
    @Column(name = "USER_EVENT_ID", nullable = false)
    Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "USER_ID", nullable = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private User user;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "EVENT_ID", nullable = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Event event;

    public User_event(User user, Event event) {
        this.user = user;
        this.event = event;
    }

    public User_event() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

}
