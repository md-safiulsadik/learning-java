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
    private ClockHand min;
    private ClockHand hr;


    public Timer() {
        this.sec = new ClockHand(20);
        this.min = new ClockHand(10);
        this.hr = new ClockHand(10);
    }

    public void advance() {
        this.sec.advance();

        if (this.sec.value() == 0) {
            this.min.advance();
        }

        if (this.min.value() == 0 && this.sec.value() == 0) {
            this.hr.advance();
        }
    }

    @Override
    public String toString() {
        return this.hr.toString() + " : " + this.min.toString() + " : " + this.sec.toString();
    }
}
