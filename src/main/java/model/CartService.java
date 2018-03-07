package model;

import java.util.ArrayList;

/**
 *
 * @author Isaac
 */
public class CartService {
    //Use "fake" hard-coded data for now to simulate the functionality of the cart
    private LineItem item = new LineItem(new Photo("23", "Yellow Lamborghini Aventador", "Yellow Lamborghini Aventador at 2017 Chicago Auto Show",
                            "autoshows/yellow-aventador.jpg", 3.25), 2);
    private ArrayList<LineItem> items = new ArrayList<>();

    public Cart createCart(){
        items.add(item);
        Cart cart = new Cart("C1", items);
        return cart;
    }
    
    public Cart getCart() {
        return createCart();
    }
//
//    public void setCart(Cart cart) {
//        this.cart = cart;
//    }
}