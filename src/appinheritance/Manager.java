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
public class Manager extends Employee {
    
    private double bonus;
    
    public Manager(String firtsName, String LastName, int age,double mistho,double bonus) {
        super(firtsName, LastName, age,mistho);
        this.bonus=bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getMistho() {
        return mistho;
    }

    public void setMistho(double mistho) {
        this.mistho = mistho;
    }
    
    
}
