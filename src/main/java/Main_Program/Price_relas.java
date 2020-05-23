package Main_Program;

public class Price_relas implements Price {

    @Override
    public double getCharge(int days_rented) {
        return (days_rented * 3 );
    }

    @Override
    public int getFrequentRenterPoints() {
        return 0;
    }
}
