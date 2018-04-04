package edu.wctc.dj.week10.data.dao;

import edu.wctc.dj.week10.model.Name;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Isaac
 */
public interface INameDAO extends JpaRepository<Name, String> {
    
}