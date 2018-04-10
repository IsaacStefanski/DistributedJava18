package edu.wctc.dj.week10.photosapp10.service;

import edu.wctc.dj.week10.photosapp10.model.Cart;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Component;

/**
 *
 * @author Isaac
 */
@Component
public class CartService {
    private static final Map<String, Cart> contents = new HashMap<>();

    public Cart getContents(String sessionId) {
        Cart cart = contents.computeIfAbsent(sessionId,
                (String t) -> new Cart());
        return cart;
    }

    public void update(String sessionId, Cart cart) {
        contents.put(sessionId, cart);	
    }

    public void delete(String sessionId) {
        contents.remove(sessionId);
    }
}