package edu.wctc.dj.week12.photosapp12.data.dao;

import edu.wctc.dj.week12.photosapp12.model.Photo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Isaac
 */
public interface IPhotoDAO extends JpaRepository<Photo, String>{
    
}