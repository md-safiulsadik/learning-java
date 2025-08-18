/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author md-safiulsadik
 */
public class Student extends Person {
    int credit;
    
    public Student(String name, String location) {
        super(name, location);
        this.credit = 0;
    }
    
    public void study() {
        credit += 1;
    }
    
    public int credits() {
        return this.credit;
    }
    
    @Override
    public String toString() {
        return this.name + " " + this.location + " Study credits " + this.credit;
    }
    
}
