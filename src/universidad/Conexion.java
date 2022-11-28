
package universidad;

import java.sql.Connection;
import java.sql.DriverManager;


public class Conexion {
    public static final String URL = "jdbc:mysql://localhost:3306/universidad?autoReconnet=true&useSSL=false";
    public static final String usuario = "root";
    public static final String contraseña = "123456789";
    
    public Connection getConnection(){
        Connection conexion = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = (Connection)DriverManager.getConnection(URL,usuario,contraseña);
        } catch (Exception e) {
            System.err.println("Error: "+e);
        }
        return conexion;
    }
}
