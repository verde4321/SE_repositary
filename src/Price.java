public interface Price {
    abstract int getCode();
    abstract double getCharge(int days_rented);
    abstract int getFrequentRenterPoints(int days_rented);
}