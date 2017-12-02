package com.example.kynansong.shopping_basket;

/**
 * Created by kynansong on 01/12/2017.
 */

public class ShopItems {

    private String itemName;
    private double itemCost;


    //will have a name and a price
    //maybe connect to a discounts interface

    public ShopItems(String itemName, double itemCost) {
        this.itemName = itemName;
        this.itemCost = itemCost;

    }
}
