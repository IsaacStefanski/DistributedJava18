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

/**
 *
 * @author Isaac
 */
@Named(value = "cartBean")
@SessionScoped
public class CartBean implements Serializable {
    private final CartService cartService = new CartService();
    private Cart cart;
    private List<LineItem> itemList;
    
    public CartBean() {
    }
    
    public String allLineItems() {
        itemList = cartService.getCart().getItemsInCart();
        return "itemList";
    }
    
    public void cartDetail(AjaxBehaviorEvent event) {
        try{
            FacesContext.getCurrentInstance().getExternalContext().redirect("cartDetail.xhtml?id=" + cart.getID());
        } catch(IOException ex) {
            FacesMessage msg = new FacesMessage("IOException", cart.getID());
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
    
    public List<LineItem> getLineItems() {
        return itemList;
    }
}