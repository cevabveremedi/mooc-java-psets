public class Gift {
    private String name;
    private int weight;

    public Gift(String name, int weight) {
        this.weight = weight;
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    public int getWeight(){
        return this.weight;
    }

    public String toString(){
        return this.name + " (" + this.weight + "kg)";
    }//which returns a string in the form "name (weight kg)"
}