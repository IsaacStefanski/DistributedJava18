package beans;

import model.Photo;
import model.PhotoService;
import java.io.IOException;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.AjaxBehaviorEvent;

/**
 *
 * @author Isaac
 */
@Named(value = "photoBean")
@SessionScoped
public class PhotoBean implements Serializable {
    private final PhotoService photoService = new PhotoService();
    private Photo photo;
    private List<Photo> photoList;
    
    public PhotoBean() {
    }
    
    public String allPhotos() {
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