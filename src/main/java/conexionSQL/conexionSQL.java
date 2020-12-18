/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author morpheus-API´s
 */
public class conexionSQL {
    
    Connection conectar=null;
    
    public Connection conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conectar=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/escuela","root","");
            JOptionPane.showMessageDialog(null, " Conexion exitosa ");
        } catch(Exception e){
            
            JOptionPane.showMessageDialog(null, " Error de conexion " + e.getMessage());
        }
        return conectar;
    }
}
