public class PaymentCard {
    private Double balance;

    public PaymentCard(double initialBalance) {
        this.balance = initialBalance;
    }

    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }

    public void eatAffordably() {
        // write code here
        if(this.balance >= 2.60) {
            this.balance -= 2.60;
        }
    }
    
    public void eatHeartily() {
        // write code here
        if(this.balance >= 4.60) {
            this.balance -= 4.60;
        }
    }

    public void addMoney(double amount) {
        // write code here
        /*
        if(this.balance + amount <= 150 && amount >= 0){
            this.balance += amount;
        }
        */
        if(amount >= 0) {
            if(this.balance + amount <= 150) {
                this.balance += amount;
            } else {
                this.balance = 150.0;
            }
        }
    }
}
