package edu.wctc.dj.week13.photosapp13.rest;

import edu.wctc.dj.week13.photosapp13.model.Photo;
import edu.wctc.dj.week13.photosapp13.service.PhotoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Isaac
 */
@RestController
public class PhotoController {
    
    @Autowired
    private PhotoService photoService;
    
    //Create (POST)
    @RequestMapping(method = POST, path = "/photo")
    public Photo createPhoto(@RequestBody Photo photo) {
        return photoService.createPhoto(photo);
    }
    
    //Read (GET)
    @RequestMapping(method = GET, path = "/photo")
    public List<Photo> getPhotoList() throws Exception {
        return photoService.getAllPhotos();
    }
    
    @RequestMapping(method = GET, path = "/photo/{id}")
    public Photo getPhoto(@PathVariable String id) {
        Photo name = photoService.getPhoto(id);
        return name;
    }
    
    //Update (PUT)
    @RequestMapping(method = PUT, path = "/photo")
    public Photo updatePhoto(@RequestBody Photo photo) {
        return photoService.updatePhoto(photo);
    }
    
    //Delete
    @RequestMapping(method = DELETE, path = "/photo/{id}")
    public void deletePhoto(@PathVariable String id) {
        photoService.deletePhoto(id);
    }
}