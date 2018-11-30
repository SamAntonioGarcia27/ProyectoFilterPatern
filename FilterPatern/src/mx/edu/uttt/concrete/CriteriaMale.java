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
public class CriteriaMale implements Criteria{

    
    //Retorna la lista de personas que son hombres.
    
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<Person>(); 
      
    
        for (Person person : persons) {
         if(person.getGender().equalsIgnoreCase("MALE")){
            malePersons.add(person);
        
         }
      }
      
        return malePersons;
    
    }

 
    
}
