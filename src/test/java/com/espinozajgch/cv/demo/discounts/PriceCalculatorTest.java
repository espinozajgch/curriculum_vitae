package com.espinozajgch.cv.demo.discounts;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class PriceCalculatorTest {

    @Test
    public void isZero(){
        PriceCalculator priceCalculator = new PriceCalculator();

        assertThat(priceCalculator.getTotal(), is(0.0));
    }

    @Test
    public void totalPrice(){
        PriceCalculator priceCalculator = new PriceCalculator();
        priceCalculator.add(10.0);
        priceCalculator.add(15.0);

        assertThat(priceCalculator.getTotal(), is(25.0));
    }

    @Test
    public void calculateDiscount(){
        PriceCalculator priceCalculator = new PriceCalculator();
        priceCalculator.add(12.5);
        priceCalculator.add(17.5);

        priceCalculator.setDiscount(25);

        assertThat(priceCalculator.discountApplied(), is(22.5));
    }

    @Test
    public void totalPriceWhitDiscount(){
        PriceCalculator priceCalculator = new PriceCalculator();
        priceCalculator.add(12.5);
        priceCalculator.add(17.5);

        priceCalculator.setDiscount(25);

        assertThat(priceCalculator.getTotal(), is(7.5));
    }
}
