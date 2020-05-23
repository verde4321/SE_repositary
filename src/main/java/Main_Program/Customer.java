package Main_Program;

import java.lang.*;
import java.util.*;

public class Customer {

    public static final String NEW_LINE = "\n";
    public static final String TAB = "\t";
    private final String name;
    private final List<Rental> rentals;

    public Customer(String name) {
        this.name = name;
        this.rentals = new ArrayList<Rental>();
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
        System.out.println(rental.getCharge());
    }

    public String statement() {

        StringBuilder builder = new StringBuilder();
        builder.append("Main_Program.Rental Record for ");
        builder.append(this.name);
        builder.append(NEW_LINE);

        builder.append(TAB);
        builder.append("Title");
        builder.append(TAB);
        builder.append(TAB);
        builder.append("Days");
        builder.append(TAB);
        builder.append("Amount");

        for (Rental rental : rentals){

            builder.append(NEW_LINE);
            builder.append(rental.getMovie().getTitle());
            builder.append(TAB);
            builder.append(TAB);
            builder.append(rental.getDaysRented());
            builder.append(TAB);
            builder.append(rental.getCharge());
        }
        //add footer lines

        builder.append(NEW_LINE);
        builder.append("Amount owed is: ");
        builder.append(getTotalCharge());
        builder.append(NEW_LINE);
        builder.append("You earned ");
        builder.append(getTotalFrequentRenterPoints());
        builder.append(" frequent renter points");
        builder.append(NEW_LINE);

        return builder.toString();
    }

    private double getTotalCharge() {
        double result = 0;
        for (Rental rental: rentals) {
            result = result + rental.getCharge();
        }
        return result;
    }

    private int getTotalFrequentRenterPoints(){
        int result = 0;
        for (Rental rental: rentals) {
            result = result + rental.getFrequentRenterPoints();
        }
        return result;
    }

}