 
package proyectochespirito;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
    
    String bd = "admin_default";
    String usuario="admin_luis";
    String pwd = "2023";
    String cadena= "jdbc:mysql://datamoviles.tk:3306/";
    Connection cx;
    
    public Connection Conectar(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cx = DriverManager.getConnection(cadena+bd,usuario,pwd);
            System.out.println("Si se conecto");
            
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
    return cx;
    }
}
