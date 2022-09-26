
package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;

// Conexion a mysql
public class Conexion {
    
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/clientes_cgi?zeroDateTimeBehavior=CONVERT_TO_NULL [root on Default schema]";
    private static final String JDBC_USER ="root";
    private static final String JDBC_PASSWORD ="";

    private static BasicDataSource dataSource;    
    
    
    public static DataSource getDatasource(){
        if (dataSource == null) {
            dataSource= new BasicDataSource();
            dataSource.setUrl(JDBC_URL);
            dataSource.setUsername(JDBC_URL);
            dataSource.setPassword(JDBC_PASSWORD);
            dataSource.setInitialSize(50);
        }
        return  dataSource;
    }
    
    public static Connection getConnection() throws SQLException{
        return getDatasource().getConnection();
    }
    
    
    //cierre de conexion 
    public static void Close(ResultSet rs){
    
        try {
            
            rs.close();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
    public static void Close(PreparedStatement stmt){
    
        try {
            
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
    public static void Close(Connection conn){
    
        try {
            
            conn.close();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }


    
}

