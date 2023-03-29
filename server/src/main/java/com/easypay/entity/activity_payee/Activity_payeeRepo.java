package com.easypay.entity.activity_payee;

import com.easypay.entity.activity.Activity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository

public interface Activity_payeeRepo extends JpaRepository<Activity_payee, Long> {
    @Transactional
    @Query("SELECT c FROM Activity_payee c WHERE c.payee.id = :payee_id")
    Optional<List<Activity_payee>> findAllPaymentsByPayee(Long payee_id);

    @Transactional
    @Query("SELECT c FROM Activity_payee c WHERE c.activity.id = :activity_id")
    Optional<List<Activity_payee>> findAllPaymentsByActivity(Long activity_id);

}
