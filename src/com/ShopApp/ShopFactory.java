package com.ShopApp;

public abstract class ShopFactory {
    public abstract GSAccount createAccount();
    public abstract GSProduct createProduct(int id, String name, double price);
    public abstract GSMobileProduct createMobileProduct(int id, String name, double price, String brand, String model);
}
