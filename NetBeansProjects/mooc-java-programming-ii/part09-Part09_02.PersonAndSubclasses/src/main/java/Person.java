/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author md-safiulsadik
 */
public class Person {
    String name;
    String location;
    
    public Person(String name, String location) {
        this.name = name;
        this.location = location;
    }
    
    @Override
    public String toString() {
        return this.name + " " + this.location;
    }
    
}
