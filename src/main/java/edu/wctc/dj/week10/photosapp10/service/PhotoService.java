package edu.wctc.dj.week10.photosapp10.service;

import edu.wctc.dj.week10.photosapp10.data.dao.IImageDAO;
import edu.wctc.dj.week10.photosapp10.data.dao.IPhotoDAO;
import edu.wctc.dj.week10.photosapp10.model.Photo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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
    private IPhotoDAO photoDao;
    
    public Photo getPhoto(String id){
        return photoDao.findOne(id);
    }
    
    public List<Photo> getAllPhotos() throws Exception{
        return photoDao.findAll();
    }
    
    public List<Photo> findPhotos(String search){
        return null;
    }
}