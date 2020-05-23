package Tests;



import Main_Program.Customer;
import Main_Program.Movie;
import Main_Program.Rental;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Testing {

    Movie movie1;
    Movie movie2;
    Customer customer;

    @Before
    public void setup() {
        movie1 = new Movie("movie2", 0);
        movie2 = new Movie("movie1", 2);

        customer = new Customer("Petter Griffon");
        customer.addRental(new Rental(movie1, 5));
        customer.addRental(new Rental(movie2, 2));
    }
    public void testCharge(){
        Assert.assertEquals(1.5, movie2.getCharge(2),0);
    }

    @Test
    public void testRenterPoints(){
        Assert.assertEquals(1, movie1.getFrequentRenterPoints());
    }
    @Test
    public void testTitle(){
        Assert.assertEquals( "movie1", movie2.getTitle());
    }
    @Test
    public void testMovieEquals(){
        Assert.assertFalse(movie1.equals(movie2));
    }
    @Test
    public void testCustomerEquals(){
        Assert.assertFalse(customer.equals(new Customer("Petter Griffon")));
    }
    @Test
    public void testStatement() {
        String statement = customer.statement();
        Assert.assertNotNull(statement);
    }

}