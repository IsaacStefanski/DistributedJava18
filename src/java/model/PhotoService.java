/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Isaac
 */
public class PhotoService {
    private List<Photo> photoList = Arrays.asList(
        new Photo("1", "Yellow Lamborghini Aventador at 2017 Chicago Auto Show", "autoshows/yellow-aventador.jpg"),
        new Photo("2", "Orange Lamborghini Huracan at 2017 Chicago Auto Show", "autoshows/orange-huracan.jpg"),
        new Photo("3", "Green Lamborghini Aventador at 2017 Chicago Auto Show", "autoshows/green-aventador.jpg"),
        new Photo("4", "White Lamborghini Huracan at 2017 Chicago Auto Show", "autoshows/white-huracan.jpg"),
        new Photo("5", "Red Kia Stinger at 2017 Chicago Auto Show", "autoshows/red-stinger-front.jpg"),
        new Photo("6", "Maserati GranTurismo at 2017 Chicago Auto Show", "autoshows/red-granturismo.jpg"),
        new Photo("7", "Maserati Ghibli at 2017 Chicago Auto Show", "autoshows/white-ghibli.jpg"),
        new Photo("8", "Porsche Wheel", "autoshows/porsche-wheel-close.jpg")
    );
    
    public Photo getPhoto(String id){
        Photo photo = null;
        for (Photo p : photoList){
            if (p.getId().equals(id)){
                photo = p;
            }
        }
        return photo;
    }
    
    public List<Photo> getAllPhotos(){
        return photoList;
    }
    
    public List<Photo> findNames(String search){
        search = search.toLowerCase();
        List<Photo> list = new ArrayList<>();
        for (Photo photo : photoList){
            if(photo.getName().toLowerCase().contains(search)){
                list.add(photo);
            }
        }
        return list;
    }
}