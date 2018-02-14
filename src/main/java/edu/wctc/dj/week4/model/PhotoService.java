package edu.wctc.dj.week4.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Isaac
 */
public class PhotoService {
    private List<Photo> photoList = Arrays.asList(
        new Photo("1", "Fiat Abarth Emblem",
                "The Abarth emblem on a Fiat 124 Spyder Abarth at the 2017 Chicago Auto Show", "autoshows/abarth-emblem.jpg"),
        
        new Photo("2", "Bentley Emblem",
                "The Bentley emblem on a Continental GT at the 2017 Milwaukee Auto Show", "autoshows/bentley-emblem.jpg"),
        
        new Photo("3", "Black Ferrari California",
                "Black Ferrari California convertible at the 2017 Milwaukee Auto Show", "autoshows/black-ferrari.jpg"),
        
        new Photo("4", "Ferrari Emblem",
                "The Ferrari emblem on a California at the 2017 Milwaukee Auto Show", "autoshows/ferrari-emblem.jpg"),
        
        new Photo("5", "Green Lamborghini Aventador",
                "Green Lamborghini Aventador at the 2017 Chicago Auto Show", "autoshows/green-aventador.jpg"),
        
        new Photo("6", "Maserati Grille",
                "Maserati trident emblem on the grille of a GranTurismo at the 2017 Milwaukee Auto Show", "autoshows/maserati-emblem.jpg"),
        
        new Photo("7", "Orange Lamborghini Huracan",
                "Orange Lamborghini Huracan at the 2017 Chicago Auto Show", "autoshows/orange-huracan.jpg"),
        
        new Photo("8", "Porsche Emblem",
                "The Porsche emblem on a 911 at the 2017 Chicago Auto Show", "autoshows/porsche-emblem.jpg"),
        
        new Photo("9", "Porsche Wheel Close-Up",
                "Close-up of the wheel of a Porsche with red brakes", "autoshows/porsche-wheel-close.jpg"),
        
        new Photo("10", "Porsche Wheel",
                "Porsche wheel with red brakes", "autoshows/porsche-wheel.jpg"),
        
        new Photo("11", "Rosso Folgore Maserati GranTurismo",
                "Maserati GranTurismo in a classy burgundy at the 2017 Chicago Auto Show", "autoshows/red-granturismo.jpg"),
        
        new Photo("12", "Red BMW i8",
                "Red BMW i8 at the 2017 Chicago Auto Show", "autoshows/red-i8.jpg"),
        
        new Photo("13", "Maserati Levante",
                "Red Maserati Levante at the 2017 Milwaukee Auto Show", "autoshows/red-levante.jpg"),
        
        new Photo("14", "Red Alfa Romeo Stelvio",
                "Red Alfa Romeo Stelvio at the 2017 Chicago Auto Show", "autoshows/red-stelvio.jpg"),
        
        new Photo("15", "Red Kia Stinger GT (Front)",
                "Front view of a sleek red Kia Stinger GT at the 2017 Chicago Auto Show", "autoshows/red-stinger-front.jpg"),
        
        new Photo("16", "Red Kia Stinger GT (Side)",
                "Side view of a Kia Stinger GT at the 2017 Chicago Auto Show", "autoshows/red-stinger-side.jpg"),
        
        new Photo("17", "White Bentley Continental GT",
                "White Bentley Continental GT at the 2017 Milwaukee Auto Show", "autoshows/white-continental-gt.jpg"),
        
        new Photo("18", "White Maserati Ghibli",
                "The aggressive front end of a white Maserati Ghibli at the 2017 Chicago Auto Show", "autoshows/white-ghibli.jpg"),
        
        new Photo("19", "White Maserati GranTurismo",
                "Looking the Maserati GranTurismo head-on at the 2017 Milwaukee Auto Show", "autoshows/white-granturismo.jpg"),
        
        new Photo("20", "White Lamborghini Huracan",
                "White Lamborghini Huracan at the 2017 Chicago Auto Show", "autoshows/white-huracan.jpg"),
        
        new Photo("21", "White Porsche Panamera",
                "White Porsche Panamera E-Hybrid at the 2017 Chicago Auto Show", "autoshows/white-panamera.jpg"),
        
        new Photo("22", "White Audi R8",
                "White Audi R8 at the 2017 Milwaukee Auto Show", "autoshows/white-r8.jpg"),
        
        new Photo("23", "Yellow Lamborghini Aventador",
                "Yellow Lamborghini Aventador at 2017 Chicago Auto Show", "autoshows/yellow-aventador.jpg"),
        
        new Photo("24", "Aston Martin Emblem",
                "Aston Martin emblem", "cars/aston-martin-emblem.jpg"),
        
        new Photo("25", "Aston Martin Wheel",
                "Close-up of an Aston Martin wheel", "cars/aston-martin-wheel.jpg"),
        
        new Photo("26", "Ferrari 458",
                "A red Ferrari 458 drives through Greenfield", "cars/ferrari-458.jpg"),
        
        new Photo("27", "Opel GT (Rear)",
                "Rear view of a red 1973 Opel GT at the Volo Auto Museum", "cars/opel-gt-rear.jpg"),
        
        new Photo("28", "1973 Opel GT",
                "Red 1973 Opel GT at the Volo Auto Museum", "cars/opel-gt.jpg"),
        
        new Photo("29", "Porsche in Motion",
                "Black Porsche 911 driving by", "cars/porsche-motion-1.jpg"),
        
        new Photo("30", "Porsche in Motion",
                "Black Porsche 911 driving by", "cars/porsche-motion-2.jpg"),
        
        new Photo("31", "Mercedes SLS AMG",
                "Silver Mercedes SLS AMG supercar owns the freeway", "cars/sls-amg.jpg"),
        
        new Photo("32", "Maserati Ghibli",
                "White Maserati Ghibli on a cloudy day in the Windy City", "cars/white-ghibli-filter.jpg"),
        
        new Photo("33", "Colorful Fungus",
                "A log growing some vibrant fungus in a Black River Falls forest", "outdoors/colorful-fungus.jpg"),
        
        new Photo("34", "Fall Railroad",
                "Looking down the Milwaukee County Zoo railroad tracks in the middle of fall", "outdoors/fall-railroad.jpg"),
        
        new Photo("35", "In the Forest",
                "A view of the trees in a Black River Falls forest", "outdoors/forest.jpg"),
        
        new Photo("36", "Leaves",
                "Red-orange leaves on the deck", "outdoors/leaves-deck.jpg")
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
    
    public List<Photo> findPhotos(String search){
        search = search.toLowerCase();
        List<Photo> list = new ArrayList<>();
        for (Photo photo : photoList){
            if(photo.getName().toLowerCase().contains(search) ||
                    photo.getDescription().toLowerCase().contains(search)){
                list.add(photo);
            }
        }
        return list;
    }
}