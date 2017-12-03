package com.example.kynansong.shopping_basket;

import java.util.ArrayList;

/**
 * Created by kynansong on 01/12/2017.
 */

public class ShoppingBasket {

    //buy one get one free adds two items to the basket

    ArrayList<ShopItem> basket;

    public ShoppingBasket() {
        this.basket = new ArrayList();
    }

    public int itemCount() {
        return basket.size();
    }

    public void addItem(ShopItem item) {
        basket.add(item);
    }

    public void removeItem(ShopItem item) {
        this.basket.remove(item);
    }

    public void emptyBasket() {
        this.basket.clear();
    }

    public double totalShoppingAmount() {
        double totalSpend = 0;
        for (ShopItem item : basket) {
            totalSpend += item.getPrice();
        }
        return totalSpend;
    }

    public void buyOneGetOneFree(ShopItem item) {  //not dry but works.
        basket.add(item);
        basket.add(item);
    }

    public double dealTotal() {  //assumes that every item is buy one get one free, thus the total is always half.
        double result = totalShoppingAmount();
        return result / 2;

    }
}
