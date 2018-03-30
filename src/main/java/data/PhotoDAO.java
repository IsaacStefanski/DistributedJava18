package data;

import model.Photo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Isaac
 */
public class PhotoDAO {
    public List<Photo> getPhotos() throws Exception {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try{
            conn = ConnectionUtil.getConnection();
            stmt = conn.prepareStatement("select * from photo");
            rs = stmt.executeQuery();
            
            List<Photo> photoList = new ArrayList<>();
            while(rs.next()){
                String id = rs.getString("id");
                String photoName = rs.getString("photoname");
                String description = rs.getString("description");
                String file = rs.getString("imgid");
                double price = rs.getDouble("price");
                
                Photo photo = new Photo(id, photoName, description, null, price);
                
                photoList.add(photo);
            }
            return photoList;
        } finally {
            if(rs != null) rs.close();
            if(stmt != null) stmt.close();
            if(conn != null) conn.close();
        }
    }
}