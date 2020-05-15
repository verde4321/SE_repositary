import java.util.HashMap;

public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private String title;
    private int priceCode;
    private Price price;
    public Movie(String newtitle, int newpriceCode) {
        title = newtitle;
       setPriceCode(priceCode);
    }
    public int getPriceCode() {
        return priceCode;
    }
    public void setPriceCode(int arg) {
        HashMap<Integer,PriceCode> movieprice = new HashMap<>();
        movieprice.put(REGULAR,()-> price= new Price_Regular());
        movieprice.put(CHILDRENS,()-> price= new Price_Children());
        movieprice.put(NEW_RELEASE,()-> price= new Price_relas());
    }
    public String getTitle (){
        return title;
    };

    private static interface PriceCode {
        public void gibAn();
    }
    public double getCharge(int daysRented) {
        return price.getCharge(daysRented);
    }

    public int getFrequentRenterPoints( int daysRented) {
        return price.getFrequentRenterPoints(daysRented);
    }

}