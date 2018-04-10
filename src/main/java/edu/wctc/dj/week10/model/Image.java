package edu.wctc.dj.week10.model;

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
    
    private String file;

    public Image() {

    }
    
    public Image(String id, String file) {
        this.id = id;
        this.file = file;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }
}