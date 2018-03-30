package data;

import model.Photo;
import model.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Isaac
 */
public class ImageDAO {
    public Image getImage(Photo photo) throws Exception {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try{
            conn = ConnectionUtil.getConnection();
            stmt = conn.prepareStatement("select * from image where id = ?");
            stmt.setString(1, photo.getId());
            rs = stmt.executeQuery();
            
            Image image = null;
            
            if(rs.next()){
                String id = rs.getString("id");
                String file = rs.getString("imgfile");
                
                image = new Image(id, file);
            }
            return image;
        } finally {
            if(rs != null) rs.close();
            if(stmt != null) stmt.close();
            if(conn != null) conn.close();
        }
    }
}