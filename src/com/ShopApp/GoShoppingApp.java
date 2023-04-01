package com.ShopApp;

import java.util.ArrayList;
import java.util.List;

public class GoShoppingApp {
	
    public static void main(String[] args) {
        // Create a Normal Account and book a product
        GSAccount normalAccount = GSShopFactory.createAccount("Kunal", false);
        GSProduct product1 = GSShopFactory.createProduct(1001, "Laptop", 500.00);
        normalAccount.bookProduct(product1);

        // Create a Prime Account and book a product
        GSAccount primeAccount = GSShopFactory.createAccount("Nishad", true);
        GSProduct product2 = GSShopFactory.createProduct(1002, "Smartphone", 300.00);
        primeAccount.bookProduct(product2);
    }
    /*
     public static void main(String[] args) {
    // Create a shop factory
    GSShopFactory shopFactory = new GSShopFactory();

    // Create a normal account and a prime account
    GSAccount normalAccount = shopFactory.createAccount("normal");
    GSAccount primeAccount = shopFactory.createAccount("prime");

    // Book a mobile product with each account
    GSProduct mobileProduct = shopFactory.createProduct("mobile", "Samsung Galaxy S21", 999.99);
    normalAccount.bookProduct(mobileProduct);
    primeAccount.bookProduct(mobileProduct);

    // Book a TV product with each account
    GSProduct tvProduct = shopFactory.createProduct("tv", "Sony Bravia X90J", 1499.99);
    normalAccount.bookProduct(tvProduct);
    primeAccount.bookProduct(tvProduct);

    // Print the list of booked products for each account
    System.out.println("Products booked by Normal Account:");
    for (GSProduct product : normalAccount.getBookedProducts()) {
        System.out.println(product.getName() + " - $" + product.getPrice());
    }

    System.out.println("Products booked by Prime Account:");
    for (GSProduct product : primeAccount.getBookedProducts()) {
        System.out.println(product.getName() + " - $" + product.getPrice());
    }
}
     */
}