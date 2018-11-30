package mx.edu.uttt.concrete;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import mx.edu.uttt.criteria.Criteria;
/**
 *
 * @author net 02
 */

import mx.edu.uttt.entidad.Person;
import java.util.ArrayList;
import java.util.List;

public class CriteriaSingle implements Criteria
{

 // Retorna la lista de personas que son solteras
    
    
 @Override
 public List<Person> meetCriteria( List<Person> persons ){
     
     
 List<Person> singlePersons = new ArrayList<Person>(); 
      
      for (Person person : persons) {
         if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")){
            singlePersons.add(person);
     
         }
      }
      
      return singlePersons;
 }
}

