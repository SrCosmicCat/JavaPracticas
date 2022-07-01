package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class Conexion {
    Connection con;
    Statement smt;
    ResultSet rs;

    public Conexion() {
    }
    
    public void conectar() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Ruta a la BD, usuario, password
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/utmart","root","");
            smt = con.createStatement();
            
            System.out.println("Conexión exitosa");
        }
        catch (Exception e) {
            System.out.println("Error en la conexión "+e);
        }
    }
    
    public void desconectar() {
        try{
            con.close();
            System.out.println("Desconexión exitosa");
        }
        catch (Exception e) {
            System.out.println("Error al desconectar "+e);
        }
    }
}
