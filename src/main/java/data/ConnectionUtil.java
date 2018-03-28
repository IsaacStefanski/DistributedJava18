package data;

import java.sql.Connection;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

/**
 *
 * @author Isaac
 */
public class ConnectionUtil {
    public static Connection getConnection() throws Exception {
        Context initContext = new InitialContext();
        Context webContext = (Context) initContext.lookup("java:comp/env");
        DataSource ds = (DataSource) webContext.lookup("jdbc/myNames");
        return ds.getConnection();
    }
}