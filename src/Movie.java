import java.util.HashMap;

public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private final String title;
    private int priceCode;
    private Price price;
    public Movie(String newtitle, int newpriceCode) {
        title = newtitle;
       setPriceCode(priceCode);
    }
    private int getPriceCode() {
        return priceCode;
    }

    private void setPriceCode(int arg) {

        if (arg == REGULAR) {
            price = new Price_Regular();
        }
        if (arg == CHILDRENS){
            price = new Price_Children();
        }
        if (arg == NEW_RELEASE){
            price = new Price_relas();
        }
    }


    public String getTitle (){
        return title;
    };

    private static interface PriceCode {
        public void gibAn();
    }
    public double getCharge(int days_rented) {
        return price.getCharge(days_rented);
    }

    public int getFrequentRenterPoints( int daysRented) {
        return price.getFrequentRenterPoints(daysRented);
    }

}