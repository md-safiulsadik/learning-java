
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author md-safiulsadik
 */
public class Room {
    private ArrayList<Person> persons;
    
    public Room() {
        this.persons = new ArrayList<>();
    }
    
    public void add(Person person) {
        this.persons.add(person);
    }
    
    public boolean isEmpty() {
        return this.persons.isEmpty();
    }
    
    public Person shortest() {
        if (this.persons.isEmpty()) {
            return null;
        }
        
        Person sortest = this.persons.get(0);
        int sortestHight = this.persons.get(0).getHeight();
        
        for (Person person : this.persons) {
            if (person.getHeight() < sortestHight) {
                sortestHight = person.getHeight();
                sortest = person;
            }
        }
        
        return sortest;
    }
    
    public Person take() {
        if (this.persons.isEmpty()) {
            return null;
        }
        
        Person sortestPerson = this.persons.remove(persons.indexOf(this.shortest()));
        return sortestPerson;
    }
    
    public ArrayList<Person> getPersons() {
        return this.persons;
    }
}
