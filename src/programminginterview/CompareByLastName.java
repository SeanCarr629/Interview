/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programminginterview;

import java.util.Comparator;

/**
 *
 * @author scarroll
 */
public class CompareByLastName implements Comparator<Person>{
    
    
    @Override
    public int compare(Person a, Person b) {
       return a.getLastName().compareTo(b.getLastName());
    }
    
    
    
}
