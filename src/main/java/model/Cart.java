package model;

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
    
    public int getItemsInCart(){
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