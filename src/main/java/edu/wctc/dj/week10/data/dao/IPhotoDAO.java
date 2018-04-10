package edu.wctc.dj.week10.data.dao;

import edu.wctc.dj.week10.model.Photo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Isaac
 */
public interface IPhotoDAO extends JpaRepository<Photo, String>{
    
}