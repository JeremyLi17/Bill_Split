package com.easypay.entity.Event;

import com.easypay.entity.user.User;

import javax.persistence.*;

import java.util.Date;
import java.util.List;

import static javax.persistence.GenerationType.SEQUENCE;


//Remember to add Entity Name
@Entity
public class Event {
    public Event() {
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", event_name='" + name + '\'' +
                ", start_date=" + start_date +
                ", end_date=" + end_date +
                ", user=" + user +
                '}';
    }

    public Event(Long id, String event_name, Date start_date, Date end_date, List<User> user) {
        this.id = id;
        this.name = event_name;
        this.start_date = start_date;
        this.end_date = end_date;
        this.user = user;
    }

    @Id
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "EVENT_SEQUENCE"
    )
    @SequenceGenerator(
            name = "EVENT_SEQUENCE",
            sequenceName = "EVENT_SEQUENCE",
            initialValue = 1,
            allocationSize = 1
    )
    Long id;

    String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setEvent_name(String event_name) {
        this.name = event_name;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public List<User> getUser() {
        return user;
    }

    public void setUser(List<User> user) {
        this.user = user;
    }

    Date start_date;
    Date end_date;


//Foreign Key (Option + ?  = 引入)
    @ManyToMany
    @Column(name = "Participants", nullable = false)
    List<User> user;
}
