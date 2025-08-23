/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author md-safiulsadik
 */
public class Teacher extends Person{
    private int salary;
    
    public Teacher(String name, String location, int salary) {
        super(name, location);
        this.salary = salary;
    }
    
    @Override
    public String toString() {
        return getName() + "\n  " + getLocation() + "\n  salary " + this.salary + " euro/month";
    }
}
