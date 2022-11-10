public class Container {
    private int current;
    private int max;

    public Container() {
        this.current = 0;
        this.max = 100;
    }

    public int contains() {
        return this.current;
    } //which returns the amount of liquid in a container as an integer.

    public void add(int amount) {
        if(amount > 0) {
            if(this.current + amount <= this.max)
                this.current += amount;
            else
                this.current = 100;
        }
    }

    public void remove(int amount) {
        if(amount > 0) {
            if(this.current - amount >= 0)
                this.current -= amount;
            else
                this.current = 0;
        }
    }

    public String toString() {
        return this.current + "/100";
    }
}
