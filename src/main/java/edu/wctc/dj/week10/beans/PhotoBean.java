package edu.wctc.dj.week10.beans;

import edu.wctc.dj.week10.model.Photo;
import edu.wctc.dj.week10.service.PhotoService;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.AjaxBehaviorEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author Isaac
 */
@Component("photoBean")
@Scope("session")
public class PhotoBean implements Serializable {
    
    @Autowired
    private PhotoService photoService;
    
    private Photo photo;
    private List<Photo> photoList;
    
    public PhotoBean() {
    }
    
    public String allPhotos() throws Exception {
        photoList = photoService.getAllPhotos();
        return "photoList";
    }
    
    public void photoDetail(AjaxBehaviorEvent event) {
        try{
            FacesContext.getCurrentInstance().getExternalContext().redirect("photoDetail.xhtml?id=" + photo.getId());
        } catch(IOException ex) {
            FacesMessage msg = new FacesMessage("IOException", photo.getId());
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
    }

    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }

    public List<Photo> getPhotoList() {
        return photoList;
    }

    public void setPhotoList(List<Photo> photoList) {
        this.photoList = photoList;
    }
}