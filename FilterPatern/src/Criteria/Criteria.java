/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 package Criteria;
*/
/**
 *
 * @author net02
 */

import Entidad.Person;
import java.util.List;


public interface Criteria {
 public List<Person> meetCriteria(List<Person> persons);

}
