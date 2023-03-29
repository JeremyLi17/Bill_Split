package com.easypay.entity.activity_payee;

import com.easypay.entity.activity.Activity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository

public interface Activity_payeeRepo extends JpaRepository<Activity_payee, Long> {
    @Transactional
    @Query("SELECT c FROM Activity_payee c WHERE c.payee.id = :payee_id")
    List<Activity_payee> findAllPaymentsByPayee(@Param("payee_id") Long payee_id);
    @Query("SELECT c FROM Activity_payee c WHERE c.activity.id = :activity_id")
    List<Activity_payee> findAllPaymentsByActivity(@Param("type") Long activity_id);

}
