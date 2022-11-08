
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

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        return new Money(this.euros + addition.euros, this.cents + addition.cents);
    }

    public boolean lessThan(Money compared) {
        if(this.euros < compared.euros) {
            return true;
        } else if(this.euros > compared.euros) {
            return false;
        } else {
            if(this.cents < compared.cents()) {
                return true;
            } else {
                return false;
            }
        }
    }

    public Money minus(Money decreaser) {
        /*
        int newEuros = decreaser.euros - this.euros;
        int newCents = decreaser.cents - this.cents;
        if(newEuros > this.euros) {
            newEuros = 0;
        }
        if(newCents > this.cents) {
            newCents = 0;
        }
        */

        /*
        int newEuros = decreaser.euros > this.euros ? 0 : this.euros - decreaser.euros;
        int newCents = decreaser.cents > this.cents ? 0 : this.cents - decreaser.cents;
        */

        int thisTotal = this.euros * 100 + this.cents;
        int decreaserTotal = decreaser.euros * 100 + decreaser.cents;

        thisTotal -= decreaserTotal;

        int newEuros = thisTotal / 100;
        int newCents = thisTotal % 100;

        if(thisTotal < 0) {
            newEuros = 0;
            newCents = 0;
        }

        return new Money(newEuros, newCents);
    }

}
