
public class Apartment {
    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter){
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    public boolean larger(Apartment otherApartment) {
        if (this.squareMeters > otherApartment.squareMeters) {
            return true;
        } else {
            return false;
        }
    }

    public int priceDifference(Apartment otherApartment) {
        int price1 = this.squareMeters*this.pricePerSquareMeter;
        int price2 = otherApartment.squareMeters*otherApartment.pricePerSquareMeter;
        int difference = price1 - price2;
        return Math.abs(difference);
    }

    public int getPrice(){
        int price = this.squareMeters*this.pricePerSquareMeter;
        return price;
    }

    public boolean moreExpensiveThan(Apartment otherApartment){
        if (this.getPrice()>otherApartment.getPrice()) {
            return true;
        } else {
            return false;
        }
    }


}
  