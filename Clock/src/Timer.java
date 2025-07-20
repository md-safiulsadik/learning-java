
public class Timer {

    private final ClockHand seconds;
    private final ClockHand minutes;
    private final ClockHand hours;

    public Timer() {
        this.seconds = new ClockHand(60);
        this.minutes = new ClockHand(60);
        this.hours = new ClockHand(24);
    }

    public Timer( int hours, int minutes, int seconds) {
        this.seconds = new ClockHand(seconds);
        this.minutes = new ClockHand(minutes);
        this.hours = new ClockHand(hours);
    }

    public void advance() {
        this.seconds.advance();

        if (this.seconds.getValue() == 0) {
            this.minutes.advance();
        }

        if (this.seconds.getValue() == 0 && this.minutes.getValue() == 0) {
            this.hours.advance();
        }
    }

    @Override
    public String toString() {
        return this.hours.toString() + ":" + this.minutes.toString() + ":" + this.seconds.toString();
    }
}
