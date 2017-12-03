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
}
