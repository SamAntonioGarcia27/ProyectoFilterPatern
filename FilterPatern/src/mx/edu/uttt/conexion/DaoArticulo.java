/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uttt.conexion;

import mx.edu.uttt.criteria.Criteria;
import mx.edu.uttt.concrete.AndCriteria;
import mx.edu.uttt.concrete.CriteriaFemale;
import mx.edu.uttt.concrete.CriteriaMale;
import mx.edu.uttt.concrete.CriteriaSingle;
import mx.edu.uttt.concrete.OrCriteria;
import mx.edu.uttt.entidad.Person;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Date;

/**
 *
 * @author net02
 */


public class DaoArticulo extends Configuracion {
    
    private Connection conexionSqlServer;
    private PreparedStatement pdst;

    public DaoArticulo() throws ClassNotFoundException {
         try {
            Class.forName(DriverSqlServer);
            this.conexionSqlServer = DriverManager.getConnection(UrlSqlServer);
            this.conexionSqlServer.setAutoCommit(false);
            System.out.println("Conexion a SQLServer exitosa :')");
        } catch (SQLException ex) {
            Logger.getLogger(DaoArticulo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    List<Person> personas= new ArrayList<Person>();
    
      public List buscarArticulos() {
         
        try {
            Statement st = conexionSqlServer.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Persona");
            while (rs.next()) {
              
              String nombre=rs.getString(1);
            
              String genero=rs.getString(2);
              String marital=rs.getString(3);
              
                System.out.println(nombre);
              personas.add(new Person( nombre, genero, marital));
            }

        } catch (SQLException ex) {
           
        }
        
        return personas;

    }
    
      
      
      //Los creamos
      Criteria single = new CriteriaSingle();
      Criteria female = new CriteriaFemale();
      Criteria male = new CriteriaMale();
      Criteria singleMale = new AndCriteria(single, male);
      Criteria singleOrFemale = new OrCriteria(single, female);
      
      
      
    public static void printPersons(List<Person> persons){
            for (Person product : persons) {
                System.out.println("Persona : [nombre: "+product.getName()+" Genero "+product.getGender()+" Estado marital "+product.getMaritalStatus());
        }
        }
    
    

}
