package com.ShopApp;

public class GSMobileProduct extends GSProduct {
    private String brand;
    private String model;

    public GSMobileProduct(int productID, String productName, double productPrice, String brand, String model) {
        super(productID, productName, productPrice);
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    @Override
    public void calculateDiscount(GSAccount account) {
        if (account instanceof GSPrimeAcc) {
            double discountedPrice = productPrice * (1 - ((GSPrimeAcc) account).getPrimeDiscount()/100);
            productPrice = discountedPrice;
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "Brand: " + brand + "\n" +
                "Model: " + model + "\n";
    }
}
