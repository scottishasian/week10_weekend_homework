package com.example.kynansong.shopping_basket;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by kynansong on 02/12/2017.
 */

public class ShopItemTest {

    ShopItem shopItem;

    @Before
    public void before() {
        shopItem = new ShopItem("Quiche", 3.40);

    }

    @Test
    public void canGetItemNameTest() {
        assertEquals("Quiche", shopItem.getName());
    }

    @Test
    public void canGetItemPriceTest() {
        assertEquals(3.40, shopItem.getPrice());
    }
}
