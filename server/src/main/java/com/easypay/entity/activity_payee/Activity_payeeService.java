package com.easypay.entity.activity_payee;

import com.easypay.entity.activity.Activity;
import com.easypay.entity.activity.ActivityRepo;
import com.easypay.entity.user.User;
import com.easypay.entity.user.UserRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
        Optional<Activity> activity = activityRepo.findById(activityId);
        Optional<User> payee = userRepo.findById(payeeId);
        activity_payee.setPayee(payee.get());
        activity_payee.setActivity(activity.get());
        activity_payee.setAmount(amount);
        activity_payeeRepo.save(activity_payee);
        return activity_payee;
    }
    public List<Activity_payee> findAllPaymentsByPayee(Long payee_id){

        return activity_payeeRepo.findAllPaymentsByPayee(payee_id).get();
    }
    public List<Activity_payee> findAllPaymentsByActivity(Long activity_id){
        return activity_payeeRepo.findAllPaymentsByActivity(activity_id).get();
    }
    public void deleteActivity_payee(Long id) {
        activity_payeeRepo.deleteById(id);
    }

}
