package com.ShopApp;

public abstract class GSAccount {
    private String name;
    
    public GSAccount(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public abstract double getDiscountRate();
    
    public void bookProduct(GSProduct product) {
        double price = product.getPrice() * (1 - getDiscountRate());
        System.out.println("Account " + name + " booked " + product.getName() + " at price $" + price);
    }
    
    /*
    public void bookProduct(GSProduct product) {
        double price = product.getPrice();
        double discount = getDiscountRate();
        double discountedPrice = price * (1 - discount);

        System.out.println("Booking product: " + product.getName());
        System.out.println("Price: $" + price);
        System.out.println("Discount rate: " + discount * 100 + "%");
        System.out.println("Discounted price: $" + discountedPrice);

        // Add the product to the list of booked products
        bookedProducts.add(product);
    }*/
}