package Main_Program;

public class Price_Regular implements Price {

    @Override
    public double getCharge(int days_rented) {
        if (days_rented > 2) return (days_rented - 2 ) * 1.5;
        else return 2;
    }

    @Override
    public int getFrequentRenterPoints() {
        return 1;
    }
}
