package edu.wctc.dj.week9.model;

import edu.wctc.dj.week9.data.AddressDAO;
import edu.wctc.dj.week9.data.NameDAO;
import java.util.List;

/**
 *
 * @author Isaac
 */
public class NameService {   
    public Name getName(String id){
        return null;
    }
    
    public List<Name> getAllNames() throws Exception{
        NameDAO nameDAO = new NameDAO();
        List<Name> nameList = nameDAO.getNames();
        
        if(nameList != null){
            AddressDAO addressDAO = new AddressDAO();
            for(Name n : nameList){
                n.setAddress(addressDAO.getAddress(n));
            }
        }
        return nameList;
    }
    
    public List<Name> findNames(String search){
        return null;
    }
}