package com.ShopApp;

public class GSNormalAcc extends GSAccount {
    public GSNormalAcc(String customerName) {
        super(customerName);
    }

    @Override
    public double getDiscountRate() {
        return 0;
    }

    @Override
    public void bookProduct(GSProduct product) {
        System.out.println("Product booked by Normal Account");
    }
}