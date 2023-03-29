package com.easypay.entity.activity_payer;

import com.easypay.entity.activity.Activity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
public class Activity_payer {
    @Id
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "ACTIVITY_PAYER_SEQUENCE"
    )
    @SequenceGenerator(
            name = "ACTIVITY_PAYER_SEQUENCE",
            sequenceName = "ACTIVITY_PAYER_SEQUENCE",
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
    @JoinColumn(name = "PAYER_ID", nullable = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private User payer;

    public Activity_payer(Long id, float amount, Activity activity, User payer) {
        this.id = id;
        this.amount = amount;
        this.activity = activity;
        this.payer = payer;
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

    public User getPayer() {
        return payer;
    }

    public void setPayer(User payer) {
        this.payer = payer;
    }
}
