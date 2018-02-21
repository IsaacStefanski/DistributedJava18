package edu.wctc.dj.week4.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Isaac
 */
public class CartService {
    private List<LineItem> lineItems = Arrays.asList(       
        new LineItem(new Photo("23", "Yellow Lamborghini Aventador",
                "Yellow Lamborghini Aventador at 2017 Chicago Auto Show", "autoshows/yellow-aventador.jpg", 3.25), 1)
    );

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    public void setLineItems(List<LineItem> lineItems) {
        this.lineItems = lineItems;
    }
}