package model;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Isaac
 */
public class CartService {
    //Use "fake" hard-coded data for now to simulate the functionality of the cart
    private List<LineItem> itemList = Arrays.asList(
            new LineItem(
                    new Photo(
                            "23", "Yellow Lamborghini Aventador", "Yellow Lamborghini Aventador at 2017 Chicago Auto Show",
                            "autoshows/yellow-aventador.jpg", 3.25
                    ),
                2)
    );    
    private Cart cart = new Cart("C1", itemList);
    
    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}