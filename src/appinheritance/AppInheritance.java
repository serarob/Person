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
public class AppInheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Person p=new Person("Dimitris","Papantonioy",35);
        Employee e=new Employee("Dimos","Kassios",34,800);
        Manager m=new Manager("Haris","Pasios",35,1000,500);   
        
    }
    
}
