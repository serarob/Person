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
public class Person {
    
    private String firtsName;
    private String LastName;
    private int age;
    
    
      public Person(String firtsName,String LastName,int age) {
        this.firtsName=firtsName;
        this.LastName = LastName;
        this.age=age;
        
    }

    /**
     * @return the firtsName
     */
    public String getFirtsName() {
        return firtsName;
    }

    /**
     * @param firtsName the firtsName to set
     */
    public void setFirtsName(String firtsName) {
        this.firtsName = firtsName;
    }

    /**
     * @return the LastName
     */
    public String getLastName() {
        return LastName;
    }

    /**
     * @param LastName the LastName to set
     */
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }
    
}
