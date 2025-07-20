/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author md-safiulsadik
 */
public class Whistle {
    private String str;
    
    public Whistle(String sound) {
        this.str = sound;
    }
    
    public void sound() {
        System.out.println(this.str);
    }
}
