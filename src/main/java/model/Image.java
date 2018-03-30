package model;

/**
 *
 * @author Isaac
 */
public class Image {
    private String id;
    private String file;

    public Image(String id, String file) {
        this.id = id;
        this.file = file;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }
}