package edu.wctc.dj.week4.model;

import java.util.ArrayList;

/**
 *
 * @author Isaac
 */
public class Cart {
    private ArrayList<Photo> itemsInCart;
    private double cartTotal;

    public Cart(ArrayList<Photo> itemsInCart, double cartTotal) {
        this.itemsInCart = itemsInCart;
        this.cartTotal = cartTotal;
    }

    public ArrayList<Photo> getItemsInCart() {
        return itemsInCart;
    }

    public void setItemsInCart(ArrayList<Photo> itemsInCart) {
        this.itemsInCart = itemsInCart;
    }

    public double getCartTotal() {
        return cartTotal;
    }

    public void setCartTotal(double cartTotal) {
        this.cartTotal = cartTotal;
    }
}