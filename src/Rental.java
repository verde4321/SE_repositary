public class Rental {

    private final Movie movie;
    private final int days_rented;

    public Rental(Movie newmovie, int newdaysRented) {
        movie = newmovie;
        days_rented = newdaysRented;
    }

    public int getDaysRented() {
        return days_rented;
    }

    public Movie getMovie() {
        return movie;
    }

    public double getCharge() {
        return getMovie().getCharge(getDaysRented());
    }

    public int getFrequentRenterPoints() {
        return getMovie().getFrequentRenterPoints(getDaysRented());
    }
} 