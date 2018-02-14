package edu.wctc.dj.week4.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Isaac
 */
public class NameService {
    
    private List<Name> nameList = Arrays.asList(
        new Name("1", "Fred", "Jones", new Address("123 Main Street", "Waukesha", "WI", "53186")),
        new Name("2", "Joe", "Smith", new Address("456 1st Street", "Milwaukee", "WI", "53172"))
    );
    
    public Name getName(String id){
        Name name = null;
        for (Name n : nameList){
            if (n.getId().equals(id)){
                name = n;
            }
        }
        return name;
    }
    
    public List<Name> getAllNames(){
        return nameList;
    }
    
    public List<Name> findNames(String search){
        search = search.toLowerCase();
        List<Name> list = new ArrayList<Name>();
        for (Name name : nameList){
            if(name.getFirst().toLowerCase().startsWith(search) ||
                    name.getLast().toLowerCase().startsWith(search)){
                list.add(name);
            }
        }
        return list;
    }
}