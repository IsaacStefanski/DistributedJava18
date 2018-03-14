/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.AjaxBehaviorEvent;
import model.Cart;
import model.CartService;
import model.LineItem;
import model.Photo;

/**
 *
 * @author Isaac
 */
@Named(value = "cartBean")
@SessionScoped
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