import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class RupeeTest {
    @Test
    void shouldReturnNotSameForTwoDifferentRupees() {
        Rupee rupee1 = new Rupee(10);
        Rupee rupee2 = new Rupee(10);

        assertNotSame(rupee1, rupee2);
    }


    @Test
    void shouldReturnTrueForTwoEqualValuedRupees() {
        Rupee rupee1 = new Rupee(10);
        Rupee rupee2 = new Rupee(10);

        assertEquals(rupee1, rupee2);
    }

    @Test
    void shouldReturnFalseForTwoDifferentValuedRupees() {
        Rupee rupee1 = new Rupee(10);
        Rupee rupee2 = new Rupee(5);


        assertNotEquals(rupee1, rupee2);
    }
    @Test
    void shouldAddRupeesAndReturnTrueIfEqualToGivenRupee(){
        Rupee rupee1 = new Rupee(3);
        Rupee rupee2 = new Rupee(7);
        Rupee rupee = new Rupee(10);

        Rupee newRupee = rupee1.add(rupee2);
        assertEquals(newRupee,rupee);
    }


    @Test
    void shouldReturnNotEqualForDifferentObjects() {
        Rupee rupee1 = new Rupee(10);
        Integer rupee2 = 10;

        assertNotEquals(rupee1,rupee2);
    }

    @Test
    void shouldReturnNotNull() {
        Rupee rupee1 = new Rupee(10);
        assertNotNull(rupee1);
    }
}
