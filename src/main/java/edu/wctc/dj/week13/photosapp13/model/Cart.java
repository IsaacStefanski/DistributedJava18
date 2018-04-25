package edu.wctc.dj.week13.photosapp13.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Isaac
 */
public class Cart implements Serializable {
    private final List<Photo> contents = new ArrayList<>();
    
    public List<Photo> getContents(){
        return contents;
    }
    
    public int getNumberOfItemsInCart(){
        return contents.size();
    }
    
    public void add(Photo photo){
        contents.add(photo);
    }
    
    public void remove(Photo photo){
        contents.remove(photo);
    }
    
    public void removeAll(){
        contents.clear();
    }
}