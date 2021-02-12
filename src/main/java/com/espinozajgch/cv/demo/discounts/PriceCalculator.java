package com.espinozajgch.cv.demo.discounts;

public class PriceCalculator {

    private double amount = 0.0;
    private int discount = 0;

    public double getTotal(){
        if(discount > 0)
            return (amount * discount) / 100;
        else
            return amount;
    }

    public void add(double amount){
        this.amount += amount;
    }

    public void setDiscount(int discount){
        this.discount = discount;
    }

    public double discountApplied(){
        double percentage = (100.0 - discount) / 100.0;
        return amount * percentage;
    }
}
