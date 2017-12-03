package com.example.kynansong.shopping_basket;

import java.util.ArrayList;

/**
 * Created by kynansong on 01/12/2017.
 */

public class ShoppingBasket {

    //buy one get one free adds two items to the basket

    ArrayList<ShopItem> ShopItem;

    public ShoppingBasket() {
        this.ShopItem = new ArrayList();
    }

    public int itemCount() {
        return ShopItem.size();
    }

    public void addItem(ShopItem item) {
        ShopItem.add(item);
    }
}
