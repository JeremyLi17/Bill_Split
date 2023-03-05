package com.easypay.entity.Event;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepoInterface extends JpaRepository<Event, Long> {
}
