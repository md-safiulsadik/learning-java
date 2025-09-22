/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author md-safiulsadik
 */
public class Literacy {
    
    private String country;
    private String gender;
    private int year;
    private double rate;
    
    public Literacy(String gender, String country, int year, double rate) {
        this.country = country;
        this.gender = gender;
        this.year = year;
        this.rate = rate;
    }
    
    public double getRate() {
        return this.rate;
    }
    
    @Override
    public String toString() {
        return this.country + " (" + this.year + "), " + 
                this.gender + ", " + this.rate;
    }
}
