package model;

/**
 *
 * @author Isaac
 */
public class Photo {
    private String id;
    private String name;
    private String file;

    public Photo(String id, String name, String file) {
        this.id = id;
        this.name = name;
        this.file = file;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }
}