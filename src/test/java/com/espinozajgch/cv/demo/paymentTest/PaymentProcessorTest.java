package com.espinozajgch.cv.demo.paymentTest;

import com.espinozajgch.cv.demo.payment.PaymentGateway;
import com.espinozajgch.cv.demo.payment.PaymentProcessor;
import com.espinozajgch.cv.demo.payment.PaymentResponse;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PaymentProcessorTest {

    PaymentGateway paymentGateway;
    PaymentProcessor paymentProcessor;

    @Before
    public void setup(){
         paymentGateway = Mockito.mock(PaymentGateway.class);
         paymentProcessor = new PaymentProcessor(paymentGateway);
    }

    @Test
    public void testPaymentCorrect(){

        Mockito.when(paymentGateway.requestPayment(Mockito.any())).
                thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));

        assertTrue(paymentProcessor.makePayment(2000.0));


    }

    @Test
    public void testPaymentIncorrect(){

        Mockito.when(paymentGateway.requestPayment(Mockito.any())).
                thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.ERROR));

        assertFalse(paymentProcessor.makePayment(2000.0));


    }
}