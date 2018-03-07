package model;

import java.util.List;

/**
 *
 * @author Isaac
 */
public class Cart {
    private String ID;
    private List<LineItem> itemsInCart;

    public Cart(String ID, List<LineItem> itemsInCart) {
        this.ID = ID;
        this.itemsInCart = itemsInCart;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public List<LineItem> getItemsInCart() {
        return itemsInCart;
    }

    public void setItemsInCart(List<LineItem> itemsInCart) {
        this.itemsInCart = itemsInCart;
    }
}