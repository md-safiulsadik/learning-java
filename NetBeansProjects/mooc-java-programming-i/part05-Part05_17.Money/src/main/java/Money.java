
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }
    
    public Money plus(Money addition) {
        Money newMoney = new Money(this.euros() + addition.euros(), this.cents() + addition.cents());
        return newMoney;
    }
   
    // This compares the ammount by converting the equros into cents ==> 
    public boolean lessThan(Money compared) {
        int thisTotal = this.euros * 100 + this.cents;
        int comparedTotal = compared.euros * 100 + compared.cents;

        return thisTotal < comparedTotal;
    }
    
    public Money minus(Money decreaser) {
        int thisTotal = this.euros * 100 + this.cents;
        int decreaserTotal = decreaser.euros * 100 + decreaser.cents;
        int diff = thisTotal - decreaserTotal;

        if (diff < 0) {
            return new Money(0, 0);
        }

        return new Money(diff / 100, diff % 100);
        
    }
    
    /*
        The a main problem is that I was a stupid who was trying to 
        count total amount of money in the wrong way.
            Thank You :)
    */
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Money)) return false;
        
        Money compared = (Money)obj;
        
        return this.euros == compared.euros && this.cents == compared.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
