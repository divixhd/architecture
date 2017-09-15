
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
public class ConexionDB {
    Connection con=null;
    public Connection conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/biblioteca","root","");
            System.out.println("Conexion Establecida");
                    
        } catch (ClassNotFoundException | SQLException e){
            System.out.println("ERROR");
        }
        return con;
    }
    Statement createStatement(){
        throw new UnsupportedOperationException("INCOMPATIBLE");
    } 

    PreparedStatement prepareStatement(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
