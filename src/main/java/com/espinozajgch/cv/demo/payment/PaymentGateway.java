package com.espinozajgch.cv.demo.payment;

public interface PaymentGateway {

    PaymentResponse requestPayment(PaymentRequest request);
}
