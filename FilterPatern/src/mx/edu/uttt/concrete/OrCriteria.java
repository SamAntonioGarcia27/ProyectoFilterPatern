package mx.edu.uttt.concrete;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author net02
 */

import mx.edu.uttt.criteria.Criteria;
import mx.edu.uttt.entidad.Person;
import java.util.List;

public class OrCriteria implements Criteria {
    
    // Puede retornar dos listas por ejemplo mujeres solteras y hoombres solteros
    
private Criteria criteria;
   private Criteria otherCriteria;

   public OrCriteria(Criteria criteria, Criteria otherCriteria) {
      this.criteria = criteria;
      this.otherCriteria = otherCriteria; 
   }

   @Override
   public List<Person> meetCriteria(List<Person> persons) {
      List<Person> firstCriteriaItems = criteria.meetCriteria(persons);
      List<Person> otherCriteriaItems = otherCriteria.meetCriteria(persons);

      
      for (Person person : otherCriteriaItems) {
         if(!firstCriteriaItems.contains(person)){
            firstCriteriaItems.add(person);
         }
      }	
      return firstCriteriaItems;
   }
}

