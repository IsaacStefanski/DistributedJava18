package edu.wctc.dj.week12.photosapp12.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Isaac
 */
@Entity
public class Image {
    
    @Id
    @GeneratedValue
    private String id;
    
    private String imgFile;

    public Image() {

    }
    
    public Image(String id, String imgFile) {
        this.id = id;
        this.imgFile = imgFile;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImgFile() {
        return imgFile;
    }

    public void setImgFile(String file) {
        this.imgFile = file;
    }
}