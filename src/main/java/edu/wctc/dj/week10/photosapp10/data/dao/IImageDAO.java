package edu.wctc.dj.week10.photosapp10.data.dao;

import edu.wctc.dj.week10.photosapp10.model.Photo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Isaac
 */
public interface IImageDAO extends JpaRepository<Photo, String> {
    
}