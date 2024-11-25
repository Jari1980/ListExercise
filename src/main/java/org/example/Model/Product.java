package org.example.Model;

import java.util.ArrayList;
import java.util.Collection;

public class Product {
    private String productName;
    private double price;
    private int stock;
    private Collection<Product> productList;

    public Product() {
        productList = new ArrayList<>();
        productList.add(new Product("Good Broccoli", 101, 50));
        productList.add(new Product("Brown Broccoli", 10, 0));
        productList.add(new Product("Green Broccoli", 145, 25));
        productList.add(new Product("Super Broccoli", 10000, 1));
    }

    public Product(String productName, double price, int stock) {
        this.productName = productName;
        this.price = price;
        this.stock = stock;
    }

/*
    public void doStuff(Collection<Product> list, Conditional prodC, Action prodA){
        //Conditional stock0 =
    }


 */
    public Collection<Product> getProductList() {
        return productList;
    }
    public String getProductName() {
        return productName;
    }
    public double getPrice() {
        return price;
    }
    public int getStock() {
        return stock;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
