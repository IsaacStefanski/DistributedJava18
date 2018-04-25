package edu.wctc.dj.week13.namesapp13.rest;

import edu.wctc.dj.week13.namesapp13.model.Name;
import edu.wctc.dj.week13.namesapp13.service.NameService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Isaac
 */
@RestController
public class NameController {
    
    @Autowired
    private NameService nameService;
    
    //Create (POST)
    @RequestMapping(method = POST, path = "/name")
    public void createName(@RequestBody Name name) {
        
    }
    
    //Read (GET)
    @RequestMapping(method = GET, path = "/name")
    public List<Name> getNameList() throws Exception {
        return nameService.getAllNames();
    }
}