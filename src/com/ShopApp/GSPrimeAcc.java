package com.ShopApp;

public class GSPrimeAcc extends GSAccount {
    public GSPrimeAcc(String customerName) {
        super(customerName);
    }

    @Override
    public double getDiscountRate() {
        return 0.1;
    }

    @Override
    public void bookProduct(GSProduct product) {
        System.out.println("Product booked by Prime Account");
    }
}