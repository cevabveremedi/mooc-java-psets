public class Cube {
    private int len;

    public Cube (int edgeLength) {
        this.len = edgeLength;
    }

    public int volume() {
        return this.len * this.len * this.len;
    }

    public String toString() {
        return "The length of the edge is " + this.len +" and the volume " + volume();
    }
    
}
