package com.espinozajgch.cv.demo.payment;

public class PaymentProcessor {

    private PaymentGateway paymentGateway;

    public PaymentProcessor(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public boolean makePayment(Double amount){

        PaymentResponse paymentResponse = paymentGateway.requestPayment(new PaymentRequest(amount));

        if(paymentResponse.getStatus() == PaymentResponse.PaymentStatus.OK){
            return true;
        }
        else{
            return false;
        }
    }
}
