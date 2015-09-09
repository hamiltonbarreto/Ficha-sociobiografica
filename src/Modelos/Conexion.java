/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Conexion {
    private String driver = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://localhost/";
    private String bd ="ficha";
    private String usuario =  "root";
    private String clave = "";
    private Connection conexion = null;
    
    public Connection conectar(){
        try {
            Class.forName(driver);
            conexion = DriverManager.getConnection(url+bd, usuario, clave);
            
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Problemas con la BD: "+ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);            
            JOptionPane.showMessageDialog(null, "Error en el driver: "+
                    ex.getMessage());
        }
        
        return conexion;
    }
    
    public Connection getConexion(){
        return this.conexion;
    }
}
