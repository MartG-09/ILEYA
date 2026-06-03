import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CheckOutTest {

    @Test
        public void testThatCheckOutExists() {
              CheckOut.getTotal();
        }

    @Test
        public void testThatCheckOutCalculatesTotal() {
            CheckOut.totalList.clear ();
            CheckOut.price = 2;
            CheckOut.piece = 550;
            double expected = 1100;
            
            CheckOut.getTotal();

            double actual = CheckOut.totalList.get(0);
            assertEquals(expected , actual);
            
        }

}
