package com.easypay.entity.activity_payer;

import com.easypay.entity.activity.Activity;
import com.easypay.entity.activity.ActivityRepo;
import com.easypay.entity.activity_payee.Activity_payee;
import com.easypay.entity.activity_payee.Activity_payeeRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class Activity_payerService {
    private final Activity_payerRepo activity_payerRepo;
    private final UserRepo userRepo;
    private final ActivityRepo activityRepo;
    @Autowired

    public Activity_payerService(Activity_payerRepo activity_payerRepo, UserRepo userRepo, ActivityRepo activityRepo) {
        this.activity_payerRepo = activity_payerRepo;
        this.userRepo = userRepo;
        this.activityRepo = activityRepo;
    }
    public Activity_payer addActivity_payer(Long activityId, Long payerId, float amount){
        Activity_payer activity_payer = new Activity_payer();
        Activity activity = activityRepo.getById(activityId);
        User payer = userRepo.getById(payerId);
        activity_payer.setPayer(payer);
        activity_payer.setActivity(activity);
        activity_payer.setAmount(amount);
        activity_payerRepo.save(activity_payer);
        return activity_payer;
    }
    public List<Activity_payer> findAllPaymentsByPayer(Long payer_id){

        return activity_payerRepo.findAllPaymentsByPayer(payer_id);
    }
    public List<Activity_payer> findAllPaymentsByActivity(Long activity_id){
        return activity_payerRepo.findAllPaymentsByActivity(activity_id);
    }
    public void deleteActivity_payer(Long id) {
        activity_payerRepo.deleteById(id);
    }
}
