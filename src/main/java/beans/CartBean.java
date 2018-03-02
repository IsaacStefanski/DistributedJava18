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
import javax.enterprise.context.Dependent;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.AjaxBehaviorEvent;
import model.Cart;

/**
 *
 * @author Isaac
 */
@Named(value = "cartBean")
@SessionScoped
public class CartBean implements Serializable {

    private Cart cart;
    
    public CartBean() {
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
}