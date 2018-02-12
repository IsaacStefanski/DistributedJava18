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
        new Photo("1", "Fiat Abarth Emblem", "autoshows/abarth-emblem.jpg"),
        new Photo("2", "Bentley Emblem", "autoshows/bentley-emblem.jpg"),
        new Photo("3", "Black Ferrari California at 2017 Milwaukee Auto Show", "autoshows/black-ferrari.jpg"),
        new Photo("4", "Ferrari Emblem", "autoshows/ferrari-emblem.jpg"),
        new Photo("5", "Green Lamborghini Aventador at 2017 Chicago Auto Show", "autoshows/green-aventador.jpg"),
        new Photo("6", "Maserati Emblem", "autoshows/maserati-emblem.jpg"),
        new Photo("7", "Orange Lamborghini Huracan at 2017 Chicago Auto Show", "autoshows/orange-huracan.jpg"),
        new Photo("8", "Porsche Emblem", "autoshows/porsche-emblem.jpg"),
        new Photo("9", "Porsche Wheel Close-Up", "autoshows/porsche-wheel-close.jpg"),
        new Photo("10", "Porsche Wheel", "autoshows/porsche-wheel.jpg"),
        new Photo("11", "Maserati GranTurismo at 2017 Chicago Auto Show", "autoshows/red-granturismo.jpg"),
        new Photo("12", "BMW i8 at 2017 Chicago Auto Show", "autoshows/red-i8.jpg"),
        new Photo("13", "Maserati Levante at 2017 Milwaukee Auto Show", "autoshows/red-levante.jpg"),
        new Photo("14", "Red Alfa Romeo Stelvio at 2017 Chicago Auto Show", "autoshows/red-stelvio.jpg"),
        new Photo("15", "Red Kia Stinger GT (Front) at 2017 Chicago Auto Show", "autoshows/red-stinger-front.jpg"),
        new Photo("16", "Red Kia Stinger GT (Side) at 2017 Chicago Auto Show", "autoshows/red-stinger-side.jpg"),
        new Photo("17", "White Bentley Continental GT at 2017 Milwaukee Auto Show", "autoshows/white-continental-gt.jpg"),
        new Photo("18", "White Maserati Ghibli at 2017 Chicago Auto Show", "autoshows/white-ghibli.jpg"),
        new Photo("19", "White Maserati GranTurismo at 2017 Milwaukee Auto Show", "autoshows/white-granturismo.jpg"),
        new Photo("20", "White Lamborghini Huracan at 2017 Chicago Auto Show", "autoshows/white-huracan.jpg"),
        new Photo("21", "White Porsche Panamera at 2017 Chicago Auto Show", "autoshows/white-panamera.jpg"),
        new Photo("22", "White Audi R8 at 2017 Milwaukee Auto Show", "autoshows/white-r8.jpg"),
        new Photo("23", "Yellow Lamborghini Aventador at 2017 Chicago Auto Show", "autoshows/yellow-aventador.jpg")
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