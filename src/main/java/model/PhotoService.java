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
        new Photo("1", "Fiat Abarth Emblem",
                "The Abarth emblem on a Fiat 124 Spyder Abarth at the 2017 Chicago Auto Show", "autoshows/abarth-emblem.jpg", 2.00),
        
        new Photo("2", "Bentley Emblem",
                "The Bentley emblem on a Continental GT at the 2017 Milwaukee Auto Show", "autoshows/bentley-emblem.jpg", 3.00),
        
        new Photo("3", "Black Ferrari California",
                "Black Ferrari California convertible at the 2017 Milwaukee Auto Show", "autoshows/black-ferrari.jpg", 3.00),
        
        new Photo("4", "Ferrari Emblem",
                "The Ferrari emblem on a California at the 2017 Milwaukee Auto Show", "autoshows/ferrari-emblem.jpg", 3.00),
        
        new Photo("5", "Green Lamborghini Aventador",
                "Green Lamborghini Aventador at the 2017 Chicago Auto Show", "autoshows/green-aventador.jpg", 3.25),
        
        new Photo("6", "Maserati Grille",
                "Maserati trident emblem on the grille of a GranTurismo at the 2017 Milwaukee Auto Show", "autoshows/maserati-emblem.jpg", 3.25),
        
        new Photo("7", "Orange Lamborghini Huracan",
                "Orange Lamborghini Huracan at the 2017 Chicago Auto Show", "autoshows/orange-huracan.jpg", 3.25),
        
        new Photo("8", "Porsche Emblem",
                "The Porsche emblem on a 911 at the 2017 Chicago Auto Show", "autoshows/porsche-emblem.jpg", 3.00),
        
        new Photo("9", "Porsche Wheel Close-Up",
                "Close-up of the wheel of a Porsche with red brakes", "autoshows/porsche-wheel-close.jpg", 3.15),
        
        new Photo("10", "Porsche Wheel",
                "Porsche wheel with red brakes", "autoshows/porsche-wheel.jpg", 3.15),
        
        new Photo("11", "Rosso Folgore Maserati GranTurismo",
                "Maserati GranTurismo in a classy burgundy at the 2017 Chicago Auto Show", "autoshows/red-granturismo.jpg", 3.25),
        
        new Photo("12", "Red BMW i8",
                "Red BMW i8 at the 2017 Chicago Auto Show", "autoshows/red-i8.jpg", 3.25),
        
        new Photo("13", "Maserati Levante",
                "Red Maserati Levante at the 2017 Milwaukee Auto Show", "autoshows/red-levante.jpg", 3.25),
        
        new Photo("14", "Red Alfa Romeo Stelvio",
                "Red Alfa Romeo Stelvio at the 2017 Chicago Auto Show", "autoshows/red-stelvio.jpg", 3.25),
        
        new Photo("15", "Red Kia Stinger GT (Front)",
                "Front view of a sleek red Kia Stinger GT at the 2017 Chicago Auto Show", "autoshows/red-stinger-front.jpg", 3.00),
        
        new Photo("16", "Red Kia Stinger GT (Side)",
                "Side view of a Kia Stinger GT at the 2017 Chicago Auto Show", "autoshows/red-stinger-side.jpg", 3.00),
        
        new Photo("17", "White Bentley Continental GT",
                "White Bentley Continental GT at the 2017 Milwaukee Auto Show", "autoshows/white-continental-gt.jpg", 3.25),
        
        new Photo("18", "White Maserati Ghibli",
                "The aggressive front end of a white Maserati Ghibli at the 2017 Chicago Auto Show", "autoshows/white-ghibli.jpg", 3.25),
        
        new Photo("19", "White Maserati GranTurismo",
                "Looking the Maserati GranTurismo head-on at the 2017 Milwaukee Auto Show", "autoshows/white-granturismo.jpg", 3.25),
        
        new Photo("20", "White Lamborghini Huracan",
                "White Lamborghini Huracan at the 2017 Chicago Auto Show", "autoshows/white-huracan.jpg", 3.25),
        
        new Photo("21", "White Porsche Panamera",
                "White Porsche Panamera E-Hybrid at the 2017 Chicago Auto Show", "autoshows/white-panamera.jpg", 3.25),
        
        new Photo("22", "White Audi R8",
                "White Audi R8 at the 2017 Milwaukee Auto Show", "autoshows/white-r8.jpg", 3.25),
        
        new Photo("23", "Yellow Lamborghini Aventador",
                "Yellow Lamborghini Aventador at 2017 Chicago Auto Show", "autoshows/yellow-aventador.jpg", 3.25),
        
        new Photo("24", "Aston Martin Emblem",
                "Aston Martin emblem", "cars/aston-martin-emblem.jpg", 3.50),
        
        new Photo("25", "Aston Martin Wheel",
                "Close-up of an Aston Martin wheel", "cars/aston-martin-wheel.jpg", 3.50),
        
        new Photo("26", "Ferrari 458",
                "A red Ferrari 458 drives through Greenfield", "cars/ferrari-458.jpg", 3.50),
        
        new Photo("27", "Opel GT (Rear)",
                "Rear view of a red 1973 Opel GT at the Volo Auto Museum", "cars/opel-gt-rear.jpg", 3.00),
        
        new Photo("28", "1973 Opel GT",
                "Red 1973 Opel GT at the Volo Auto Museum", "cars/opel-gt.jpg", 3.00),
        
        new Photo("29", "Porsche in Motion",
                "Black Porsche 911 driving by", "cars/porsche-motion-1.jpg", 3.00),
        
        new Photo("30", "Porsche in Motion",
                "Black Porsche 911 driving by", "cars/porsche-motion-2.jpg", 3.00),
        
        new Photo("31", "Mercedes SLS AMG",
                "Silver Mercedes SLS AMG supercar owns the freeway", "cars/sls-amg.jpg", 3.25),
        
        new Photo("32", "Maserati Ghibli",
                "White Maserati Ghibli on a cloudy day in the Windy City", "cars/white-ghibli-filter.jpg", 3.25),
        
        new Photo("33", "Colorful Fungus",
                "A log growing some vibrant fungus in a Black River Falls forest", "outdoors/colorful-fungus.jpg", 2.00),
        
        new Photo("34", "Fall Railroad",
                "Looking down the Milwaukee County Zoo railroad tracks in the middle of fall", "outdoors/fall-railroad.jpg", 2.00),
        
        new Photo("35", "In the Forest",
                "A view of the trees in a Black River Falls forest", "outdoors/forest.jpg", 2.00),
        
        new Photo("36", "Leaves",
                "Red-orange leaves on the deck", "outdoors/leaves-deck.jpg", 2.00)
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