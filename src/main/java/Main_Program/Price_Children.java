package Main_Program;

public class Price_Children implements Price {

    @Override
    public double getCharge(int days_rented) {
        if (days_rented > 3) return (days_rented - 3 ) * 1.5;
        else return 1.5;
    }

    @Override
    public int getFrequentRenterPoints() {
        return 1;
    }
}
