package com.easypay.entity.activity_payee;

import com.easypay.entity.activity.Activity;
import com.easypay.entity.user.User;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
public class Activity_payee {
    @Id
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "ACTIVITY_PAYEE_SEQUENCE"
    )
    @SequenceGenerator(
            name = "ACTIVITY_PAYEE_SEQUENCE",
            sequenceName = "ACTIVITY_PAYEE_SEQUENCE",
            initialValue = 1,
            allocationSize = 1)
    @Column(name = "PAYMENT_ID", nullable = false)
    private Long id;

    @Column(name = "SEPERATE_AMOUNT", nullable = false)
    private float amount;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ACTIVITY_ID", nullable = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Activity activity;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PAYEE_ID", nullable = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private User payee;

    public Activity_payee(Long id, float amount, Activity activity, User payee) {
        this.id = id;
        this.amount = amount;
        this.activity = activity;
        this.payee = payee;
    }

    public Activity_payee() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public User getPayee() {
        return payee;
    }

    public void setPayee(User payee) {
        this.payee = payee;
    }
}
