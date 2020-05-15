public class Price_Children implements Price {
    @Override
    public int getCode() {
        return Movie.CHILDRENS;
    }

    @Override
    public double getCharge(int days_rented) {
        if (days_rented > 3) return (days_rented - 3 ) * 1.5;
        else return 1.5;
    }

    @Override
    public int getFrequentRenterPoints(int days_rented) {
        return 1;
    }
}