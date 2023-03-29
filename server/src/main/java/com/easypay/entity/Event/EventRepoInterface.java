package com.easypay.entity.Event;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EventRepoInterface extends JpaRepository<Event, Long> {
    Optional<Event> findEventByName(String name);
}
