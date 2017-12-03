package com.example.kynansong.shopping_basket;

import java.util.ArrayList;

/**
 * Created by kynansong on 01/12/2017.
 */

public class ShoppingBasket {

    //buy one get one free adds two items to the basket

    ArrayList<ShopItem> Basket;

    public ShoppingBasket() {
        this.Basket = new ArrayList();
    }

    public int itemCount() {
        return Basket.size();
    }

    public void addItem(ShopItem item) {
        Basket.add(item);
    }

    public void removeItem(ShopItem item) {
        this.Basket.remove(item);
    }
}
