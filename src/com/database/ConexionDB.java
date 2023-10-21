 
package com.database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Logger;
import java.util.logging.Level;
/**
 *
 * @author Horizon Studios - Jose Aguilar
 */
public class ConexionDB {
    public Connection conexion;
    
    private final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private final String DB_URL = "jdbc:mysql://localhost/taskmanager";
    private final String USER = "root";
    private final String PASS = "";
     
    
    //private static final String dbHost = ("aws.connect.psdb.cloud");
    //private static final String dbUsername = ("wzcvo11fcbg5mi6gcz53");
    //private static final String dbPassword = ("pscale_pw_sDzGVbasgphWjmaMZtDstw32FDTHuZ4XFBicoN9HJW6");
    //private static final String dbName = ("taskmanager");
    
    public void Conectar() throws ClassNotFoundException{
        try {
            conexion = DriverManager.getConnection(DB_URL, USER, PASS);
            Class.forName(JDBC_DRIVER);
            System.out.println("Se ha conectado a la base de datos.");
        } catch (SQLException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void Cerrar() throws SQLException{
        if(conexion != null){
            if(!conexion.isClosed()){
                conexion.close();
            }
        }
    }
    
    //public Connection conectar() {
        
        //Properties props = new Properties();
        //props.setProperty("user", dbUsername);
        //props.setProperty("password", dbPassword);
        //props.setProperty("useSSL", "true"); // Enable SSL

        //try {
        //    String url = "jdbc:mysql://" + dbHost + "/" + dbName;
         //   return DriverManager.getConnection(url, props);
        //} catch (SQLException e) {
        //    e.printStackTrace();
          //  return null; // Manejo de errores, devuelve null en caso de error
        //}
    //}
}
