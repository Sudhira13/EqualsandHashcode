import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class RupeeTest {
    @Test
    void comparingObjectWithItself() {
        Rupee rupee = new Rupee(10,123);
        boolean value = rupee.compareRupee(rupee);
        Assertions.assertTrue(value);
    }

    @Test
    void comparingObjectWithAnotherObjectOfSameProperty() {
        Rupee rupee1 = new Rupee(10,123);
        Rupee rupee2 = new Rupee(10,123);

        boolean value = rupee1.compareRupee(rupee2);

        Assertions.assertFalse(value);
    }

    @Test
    void comparingObjectWithAnotherObjectOfDifferentProperty() {
        Rupee rupee1 = new Rupee(10,123);
        Rupee rupee2 = new Rupee(10,100);

        boolean value = rupee1.compareRupee(rupee2);

        Assertions.assertFalse(value);
    }

    @Test
    void shouldReturnTrueForTwoEqualValuedRupees() {
        Rupee rupee1 = new Rupee(10,123);
        Rupee rupee2 = new Rupee(10,123);

        assertEquals(rupee1.value,rupee2.value);
    }

    @Test
    void shouldReturnFalseForTwoDifferentValuedRupees() {
        Rupee rupee1 = new Rupee(10,123);
        Rupee rupee2 = new Rupee(12,123);

        assertNotEquals(rupee1.value,rupee2.value);
    }
}
