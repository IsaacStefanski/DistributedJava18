package edu.wctc.dj.week10.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 *
 * @author Isaac
 */
@Entity
public class Photo {
    @Id
    @GeneratedValue
    private String id;
    
    @Column(name = "photoname")
    private String name;
    
    @Column(name = "description")
    private String description;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "imgid")
    private Image image;
    
    @Column(name = "price")
    private double price;

    public Photo() {
        
    }
    
    public Photo(String id, String name, String description, Image image, double price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.image = image;
        this.price = price;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}