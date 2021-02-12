package com.espinozajgch.cv.demo.payment;

public class PaymentResponse {

    public static enum PaymentStatus {
            OK, ERROR
    }

    private PaymentStatus status;

    public PaymentResponse(PaymentStatus status) {
        this.status = status;
    }

    public PaymentStatus getStatus() {
        return status;
    }
}
