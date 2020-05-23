public class Price_relas implements Price {
    @Override
    public int getCode() {
        return Movie.NEW_RELEASE;
    }

    @Override
    public double getCharge(int days_rented) {
        return (days_rented * 3 );
    }

    @Override
    public int getFrequentRenterPoints() {
        return 0;
    }
}
