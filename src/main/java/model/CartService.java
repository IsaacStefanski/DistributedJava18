package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author Isaac
 */
public class CartService {
    private Cart cart = new Cart(
            "C1",
            new ArrayList<LineItem>(
                    (Collection<? extends LineItem>) new LineItem(
                            new Photo(
                                    "23",
                                    "Yellow Lamborghini Aventador",
                                    "Yellow Lamborghini Aventador at 2017 Chicago Auto Show",
                                    "autoshows/yellow-aventador.jpg",
                                    3.25
                            ),
                        1
                    )
            )
    );

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}