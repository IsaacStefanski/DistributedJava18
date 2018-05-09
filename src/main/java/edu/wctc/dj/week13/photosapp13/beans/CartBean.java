package edu.wctc.dj.week13.photosapp13.beans;

import java.io.Serializable;
import javax.faces.context.FacesContext;
import edu.wctc.dj.week13.photosapp13.model.Cart;
import edu.wctc.dj.week13.photosapp13.model.Photo;
import edu.wctc.dj.week13.photosapp13.service.CartService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author Isaac
 */
@Component("cartBean")
@Scope("session")
public class CartBean implements Serializable {
    
//    @Autowired
//    private CartService cartService;
    
    private final String sessionId;
    private final Cart cart;
    private final CartService cartService = new CartService();
    
    public CartBean() {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        sessionId = facesContext.getExternalContext().getSessionId(true);
        cart = cartService.getContents(sessionId);
    }
    
    public List getItemsInCart(){
        return cartService.getContents(sessionId).getContents();
    }

    public int getNumberOfItemsInCart(){
        return cart.getNumberOfItemsInCart();
    }
    
    public void addToCart(Photo photo){
        cart.add(photo);
        cartService.update(sessionId, cart);
    }
}