package com.easypay.entity.activity_payer;

import com.easypay.entity.activity_payee.Activity_payee;
import com.easypay.entity.activity_payee.Activity_payeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/api/activity_payer")
@AllArgsConstructor
public class Activity_payerController {
    private final Activity_payerService activity_payerService;
    @PostMapping("/add")
    public ResponseEntity<Activity_payer> addPayment(@RequestBody Activity_payer activity_payer)
    {
        activity_payerService.addActivity_payer(
                activity_payer.getActivity().getId(), activity_payer.getPayer().getId(), activity_payer.getAmount());
        return new ResponseEntity<>(activity_payer, CREATED);
    }
    @GetMapping("/list/{payer_id}")
    public ResponseEntity<List<Activity_payer>> findAllPaymentsByPayer(
            @PathVariable("payer_id") Long payer_id) {
        List<Activity_payer> activity_payers = activity_payerService.findAllPaymentsByPayer(payer_id);
        return new ResponseEntity<>(activity_payers, OK);
    }
    @GetMapping("/list/{activity_id}")
    public ResponseEntity<List<Activity_payer>> findAllPaymentsByActivity(
            @PathVariable("activity_id") Long activity_id) {
        List<Activity_payer> activity_payers = activity_payerService.findAllPaymentsByActivity(activity_id);
        return new ResponseEntity<>(activity_payers, OK);
    }
    @DeleteMapping("/delete")
    public void deleteActivity_payer(@RequestParam Long id)
    {
        activity_payerService.deleteActivity_payer(id);
    }
}
