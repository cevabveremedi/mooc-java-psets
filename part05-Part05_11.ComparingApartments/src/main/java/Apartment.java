
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        return this.squares > compared.squares;
    }

    public int priceDifference(Apartment compared) {
        if(this.moreExpensiveThan(compared)) {
            return this.princePerSquare * this.squares - compared.squares * compared.princePerSquare;
        } else {
            return compared.squares * compared.princePerSquare - this.squares * this.princePerSquare;
        }
    }

    public boolean moreExpensiveThan(Apartment compared) {
        return this.squares * this.princePerSquare > compared.squares * compared.princePerSquare ? true : false;
    }
}
