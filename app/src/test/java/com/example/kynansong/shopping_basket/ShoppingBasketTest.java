package com.example.kynansong.shopping_basket;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by kynansong on 03/12/2017.
 */

public class ShoppingBasketTest {

    ShoppingBasket shoppingBasket;
    ShopItem cheese, rum;

    @Before
    public void before() {
        this.shoppingBasket = new ShoppingBasket();
        this.cheese = new ShopItem("Cheese", 4.51);
        this.rum = new ShopItem("Rum", 24.67);

    }

    @Test
    public void BasketHasNoItemsTest() {
        assertEquals(0 , shoppingBasket.itemCount());
    }

    @Test
    public void BasketHasOneItemTest() {
        shoppingBasket.addItem(cheese);
        assertEquals(1, shoppingBasket.itemCount());
    }

    @Test
    public void RemoveItemFromBasket() {
        shoppingBasket.addItem(cheese);
        shoppingBasket.addItem(rum);
        assertEquals(2, shoppingBasket.itemCount());
        shoppingBasket.removeItem(rum);
        assertEquals(1, shoppingBasket.itemCount());
    }
}
