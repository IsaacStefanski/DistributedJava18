package edu.wctc.dj.week10.service;

import edu.wctc.dj.week10.data.dao.IPhotoDAO;
import edu.wctc.dj.week10.model.Photo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import static org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers.startsWith;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Isaac
 */
@Service
@Transactional
public class PhotoService {
    @Autowired
    private IPhotoDAO photoDAO;
    
    public Photo getPhoto(String id){
        return photoDAO.findOne(id);
    }
    
    public List<Photo> getAllPhotos() throws Exception{
        return photoDAO.findAll();
    }
    
    public List<Photo> findPhotos(String search){
        ExampleMatcher matcher = ExampleMatcher.matching().withMatcher("name", startsWith().ignoreCase());
        Photo photo = new Photo();
        photo.setName(search);
        return photoDAO.findAll(Example.of(photo, matcher));
    }
}