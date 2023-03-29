package com.easypay.entity.activity_payer;

import com.easypay.entity.activity_payee.Activity_payee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface Activity_payerRepo extends JpaRepository<Activity_payer, Long> {
    @Transactional
    @Query("SELECT c FROM Activity_payer c WHERE c.payer.id = :payer_id")
    List<Activity_payer> findAllPaymentsByPayer(@Param("payer_id") Long payee_id);
    @Query("SELECT c FROM Activity_payer c WHERE c.activity.id = :activity_id")
    List<Activity_payer> findAllPaymentsByActivity(@Param("activity_id") Long activity_id);
}
