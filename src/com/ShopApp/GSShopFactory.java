package com.ShopApp;

public class GSShopFactory {
    public static GSProduct createProduct(int productId, String productName, double price) {
        return new GSProduct(productId, productName, price) {
            @Override
            public void bookProduct() {
                System.out.println("Product booked");
            }
        };
    }

    public static GSAccount createAccount(String customerName, boolean isPrime) {
        if (isPrime) {
            return new GSPrimeAcc(customerName);
        } else {
            return new GSNormalAcc(customerName);
        }
    }
}
