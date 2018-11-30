/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
* Porfa ya solo editen lo de URLSqlServer porque se formateo mi lap
 */
package mx.edu.uttt.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author net02
 */
public class Configuracion {
   
    private Connection conexionSqlServer;
    
        protected final String UrlSqlServer="jdbc:sqlserver://NITRO5HTF:1433;databaseName=Filter;user=sa;password=1234t;";        //Ya nadamas editen esto para que jale el programa porfa
    protected final String DriverSqlServer="com.microsoft.sqlserver.jdbc.SQLServerDriver";
    
    
    public Configuracion() throws ClassNotFoundException {
        try{
            Class.forName(DriverSqlServer);
            conexionSqlServer=DriverManager.getConnection(UrlSqlServer);
            System.out.println("Conexion a SQLServer  exitosa :') ");
           
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "No se establecio la conexion de SQLServer nigga\n"+e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
     
     
}
