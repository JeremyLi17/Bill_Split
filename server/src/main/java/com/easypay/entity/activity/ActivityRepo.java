package com.easypay.entity.activity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository

public interface ActivityRepo extends JpaRepository<Activity, Long> {
    @Transactional
    @Query("SELECT c FROM Activity c WHERE c.event.name = :eventName")
    List<Activity> findAllActivitiesByEventName(@Param("eventName") String eventName);
    @Query("SELECT c FROM Activity c WHERE c.type = :type")
    List<Activity> findActivitiesByType(@Param("type") String type);

}
