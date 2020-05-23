interface Price {
     int getCode();
     double getCharge(int days_rented);
     int getFrequentRenterPoints(int days_rented);
}