package edu.wctc.dj.week13.photosapp13.data.dao;

import edu.wctc.dj.week13.photosapp13.model.Photo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Isaac
 */
public interface IImageDAO extends JpaRepository<Photo, String>{
    
}