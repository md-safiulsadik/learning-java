
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
        if (compared.squares < this.squares) {
            return true;
        }
        return false;
    }
    
    public int priceDifference(Apartment compared) {
        int firstPrice = this.princePerSquare * this.squares;
        int secondPrice = compared.princePerSquare * compared.squares;
        
        int priceDiff = firstPrice - secondPrice;
        
        if (priceDiff < 0) {
            priceDiff *= -1;
        }
        
        return priceDiff;
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        int firstPrice = this.princePerSquare * this.squares;
        int secondPrice = compared.princePerSquare * compared.squares;
        
        if (firstPrice > secondPrice) {
            return true;
        }
        return false;
    }
}
