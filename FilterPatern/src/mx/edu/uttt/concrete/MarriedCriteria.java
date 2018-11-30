package mx.edu.uttt.concrete;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import mx.edu.uttt.criteria.Criteria;
/**
 *
 * @author net02
 */

import mx.edu.uttt.entidad.Person;
import java.util.ArrayList;
import java.util.List;

public class MarriedCriteria implements Criteria
{
 // Retorna la lista de personas que esan casadas
    
 @Override
 public List<Person> meetCriteria( List<Person> persons ){
     
 List<Person> marriedPersons = new ArrayList<Person>();
 for( Person person : persons ){
     
 if( person.getMaritalStatus().equalsIgnoreCase("Married") ){
     
 marriedPersons.add(person);
 
 }
 }
 
 return marriedPersons;
 }
}