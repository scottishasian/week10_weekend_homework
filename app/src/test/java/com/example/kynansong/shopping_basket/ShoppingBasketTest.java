package com.example.kynansong.shopping_basket;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by kynansong on 03/12/2017.
 */

public class ShoppingBasketTest {

    ShoppingBasket shoppingBasket;

    @Before
    public void before() {
        this.shoppingBasket = new ShoppingBasket();

    }

    @Test
    public void BasketHasNoItemsTest() {
        assertEquals(0 , shoppingBasket.itemCount());
    }
}
