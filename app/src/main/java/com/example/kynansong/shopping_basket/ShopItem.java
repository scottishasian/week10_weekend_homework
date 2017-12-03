package com.example.kynansong.shopping_basket;

/**
 * Created by kynansong on 01/12/2017.
 */

public class ShopItem {

    private String itemName;
    private double itemCost;


    //will have a name and a price
    //ideally should have an interface of buy-able then each item is a class itself as there are
    //many types of each item. Cheese implements Buyable.

    public ShopItem(String itemName, double itemCost) {
        this.itemName = itemName;
        this.itemCost = itemCost;

    }

    public String getName() {
        return this.itemName;
    }

    public double getPrice() {
        return this.itemCost;
    }
}
