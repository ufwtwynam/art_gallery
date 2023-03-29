import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CustomersTest {

    private Customers customer;
    private ArrayList<Artwork> ArtworkPurchased;


    @BeforeEach
    public void setup(){
        customer = new Customers("Mario");
    }

    @Test
    public void testGetName(){
        Assertions.assertEquals("Mario", customer.getName());
    }

    @Test
    public void testGetWallet(){
        Assertions.assertEquals(0.0, customer.getWallet(), 0.01);
    }

    @Test
    public void testGetArtworkPurchased() {
        Assertions.assertEquals(new ArrayList<Artwork>(), customer.getArtworkPurchased());
    }

    @Test
    public void testDecreaseWallet() {
            customer.decreaseWallet(50);
            Assertions.assertEquals(0, customer.getWallet(), 0.01);
    }



}
