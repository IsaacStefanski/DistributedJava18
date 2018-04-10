package edu.wctc.dj.week10.beans;

import java.io.Serializable;
import javax.faces.context.FacesContext;
import edu.wctc.dj.week10.model.Cart;
import edu.wctc.dj.week10.service.CartService;
import edu.wctc.dj.week10.model.Photo;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author Isaac
 */
@Component("cartBean")
@Scope("session")
public class CartBean implements Serializable {
    private final String sessionId;
    private final Cart cart;
    private final CartService cartService = new CartService();
    
    public CartBean() {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        sessionId = facesContext.getExternalContext().getSessionId(true);
        cart = cartService.getContents(sessionId);
    }    

    public int getItemsInCart(){
        return cart.getItemsInCart();
    }
    
    public void addToCart(Photo photo){
        cart.add(photo);
        cartService.update(sessionId, cart);
    }
}