package model;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author Isaac
 */
public class LineItem {
    private Photo photo;
    private double qty;
    private double itemSubtotal;
    
    public LineItem(Photo photo, double qty){
        setPhoto(photo);
        setQty(qty);
        itemSubtotal = findItemSubtotal();
    }
    
    public final double findItemSubtotal(){
        return qty * photo.getPrice();
    }
    
    public final Photo getPhoto(){
        return photo;
    }
    
    public final void setPhoto(Photo photo){
        this.photo = photo;
    }

    public final double getQty() {
        return qty;
    }

    public final void setQty(double qty)throws IllegalArgumentException {
        if(qty >= 0.0){
            this.qty = qty;
        } else {
            throw new IllegalArgumentException("Invalid product quantity");
        }
    }
    
    public final double getItemSubtotal() {
        return itemSubtotal;
    }

    public final void setItemSubtotal(double itemSubtotal) throws IllegalArgumentException  {
        if(itemSubtotal >= 0.0){
            this.itemSubtotal = itemSubtotal;
        } else {
            throw new IllegalArgumentException("Item subtotal must be at least $0.00");
        }
    }
    
    @Override
    public final String toString(){
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
        return photo.getId() + "  " + photo.getName() + "  " + getQty() + " @ " + currencyFormatter.format(photo.getPrice()) +
                " for " + currencyFormatter.format(itemSubtotal);
    }
}