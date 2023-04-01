package com.ShopApp;

public class GSTVProduct extends GSProduct {
    public GSTVProduct(int productID, String productName, double productPrice) {
        super(productID, productName, productPrice);
    }
    
    @Override
    public void calculateDiscount(GSAccount account) {
        if (account instanceof GSPrimeAcc) {
            double discountedPrice = productPrice * (1 - ((GSPrimeAcc) account).getPrimeDiscount()/100);
            productPrice = discountedPrice;
        }
    }
}
