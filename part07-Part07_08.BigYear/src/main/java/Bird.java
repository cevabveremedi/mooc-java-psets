public class Bird {
    private String name;
    private String nameLatin;
    private int count;

    public Bird(String name, String nameLatin) {
        this.name = name;
        this.nameLatin = nameLatin;
        this.count = 0;
    }

    public void observe() {
        this.count++;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name + " (" + this.nameLatin + "): " + this.count + " observations";
    }
}
