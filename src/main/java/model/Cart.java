package model;

import java.util.ArrayList;

/**
 *
 * @author Isaac
 */
public class Cart {
    private String ID;
    private ArrayList<LineItem> itemsInCart;

    public Cart(String ID, ArrayList<LineItem> itemsInCart) {
        this.ID = ID;
        this.itemsInCart = itemsInCart;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public ArrayList<LineItem> getItemsInCart() {
        return itemsInCart;
    }

    public void setItemsInCart(ArrayList<LineItem> itemsInCart) {
        this.itemsInCart = itemsInCart;
    }
}