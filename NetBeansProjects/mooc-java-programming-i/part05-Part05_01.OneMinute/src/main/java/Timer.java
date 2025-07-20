/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author md-safiulsadik
 */
public class Timer {
    private ClockHand sec;
    private ClockHand thOfSec;
    
    
    public Timer() {
        this.sec = new ClockHand(60);
        this.thOfSec = new ClockHand(100);
    }
    
    public void advance() {
        this.thOfSec.advance();
        
        if (this.thOfSec.value() == 0) {
            this.sec.advance();
        }
    }
    
    @Override
    public String toString() {
        return String.format("%02d:%02d", this.sec.value(), this.thOfSec.value());
    }
}
