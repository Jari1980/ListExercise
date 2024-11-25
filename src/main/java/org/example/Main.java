package org.example;

import org.example.Model.Action;
import org.example.Model.Conditional;
import org.example.Model.Product;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Locale.filter;

public class Main {


    public static void main(String[] args) {

        Product prods = new Product();
        var list = prods.getProductList();
        System.out.println("All products:");
        for(Product ele : list){
            System.out.println(ele.getProductName());
        }
        System.out.println("-------------");


        System.out.println("-------------");
        System.out.println("Stock value 0");
        doStuff2(list, p -> p.getStock() == 0, p -> System.out.println(p.getProductName()));
        System.out.println("All products starting with B");
        doStuff2(list, p -> p.getProductName().startsWith("B"), p -> System.out.println(p.getProductName()));
        System.out.println("Products that have price above 100 AND lower than 150");
        doStuff2(list, p -> p.getPrice() > 100 && p.getPrice() < 150, p -> System.out.println(p.getProductName()));
        System.out.println("Increase the price of all Products that have a stock value of less than 10 AND above 0 by 50%");
        doStuff2(list, p -> p.getStock() > 0 && p.getStock() < 10, p -> p.setPrice(p.getPrice() * 1.5));

        System.out.println("All prices of items");
        for(Product element : list){
            System.out.println(element.getProductName() + " " + ", price: " + element.getPrice());
        }
    }

    public static void doStuff2(Collection<Product> list, Conditional condition, Action action){
        for(Product element : list){
            if(condition.test(element)){
                action.execute(element);
            }
        }
    }


}