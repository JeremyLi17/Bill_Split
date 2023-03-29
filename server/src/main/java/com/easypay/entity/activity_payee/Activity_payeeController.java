package com.easypay.entity.activity_payee;

import com.easypay.entity.activity.Activity;
import com.easypay.entity.activity.ActivityService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/api/activity_payee")
@AllArgsConstructor

public class Activity_payeeController {
    private final Activity_payeeService activity_payeeService;
    @PostMapping("/add")
    public ResponseEntity<Activity_payee> addPayment(@RequestBody Activity_payee activity_payee)
    {
        activity_payeeService.addActivity_payee(activity_payee.getActivity().getId(), activity_payee.getPayee().getId(), activity_payee.getAmount());
        return new ResponseEntity<>(activity_payee, CREATED);
    }
    @GetMapping("/list/{payee_id}")
    public ResponseEntity<List<Activity_payee>> findAllPaymentsByPayee(
            @PathVariable("payee_id") Long payee_id) {
        List<Activity_payee> activity_payees = activity_payeeService.findAllPaymentsByPayee(payee_id);
        return new ResponseEntity<>(activity_payees, OK);
    }
    @GetMapping("/list/{activity_id}")
    public ResponseEntity<List<Activity_payee>> findAllPaymentsByActivity(
            @PathVariable("activity_id") Long activity_id) {
        List<Activity_payee> activity_payees = activity_payeeService.findAllPaymentsByActivity(activity_id);
        return new ResponseEntity<>(activity_payees, OK);
    }
    @DeleteMapping("/delete")
    public void deleteActivity_payee(@RequestParam Long id)
    {
        activity_payeeService.deleteActivity_payee(id);
    }




}
