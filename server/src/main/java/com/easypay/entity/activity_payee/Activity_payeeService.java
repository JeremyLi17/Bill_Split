package com.easypay.entity.activity_payee;

import com.easypay.entity.activity.Activity;
import com.easypay.entity.activity.ActivityRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class Activity_payeeService {
    private final Activity_payeeRepo activity_payeeRepo;
    private final UserRepo userRepo;
    private final ActivityRepo activityRepo;
    @Autowired

    public Activity_payeeService(Activity_payeeRepo activity_payeeRepo, UserRepo userRepo, ActivityRepo activityRepo) {
        this.activity_payeeRepo = activity_payeeRepo;
        this.userRepo = userRepo;
        this.activityRepo = activityRepo;
    }

    public Activity_payee addActivity_payee(Long activityId, Long payeeId, float amount){
        Activity_payee activity_payee = new Activity_payee();
        Activity activity = activityRepo.getById(activityId);
        User payee = userRepo.getById(payeeId);
        activity_payee.setPayee(payee);
        activity_payee.setActivity(activity);
        activity_payee.setAmount(amount);
        activity_payeeRepo.save(activity_payee);
        return activity_payee;
    }
    public List<Activity_payee> findAllPaymentsByPayee(Long payee_id){

        return activity_payeeRepo.findAllPaymentsByPayee(payee_id);
    }
    public List<Activity_payee> findAllPaymentsByActivity(Long activity_id){
        return activity_payeeRepo.findAllPaymentsByActivity(activity_id);
    }
    public void deleteActivity_payee(Long id) {
        activity_payeeRepo.deleteById(id);
    }

}
