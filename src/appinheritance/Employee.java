/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appinheritance;

/**
 *
 * @author chris
 */
public class Employee extends Person {
    
    public double mistho;
    
     public Employee(String firtsName,String LastName,int age,double mistho) {
         super(firtsName ,LastName,age);
         this.mistho=mistho;
        
    }
    
}
