package bva_desciisionTable.bva_desciisionTable;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class BVA_BTest {
    @Test
    void testB_Min_1() {
        assertThrows(IllegalArgumentException.class, () -> {
            MinCalculator.findMin(50, 0, 50, 50, 50);
        });
    }

    @Test
    void testB_Min() {
        int result = MinCalculator.findMin(50, 1, 50, 50, 50);
        assertEquals(1, result);
    }

    @Test
    void testB_Plus_1() {
        int result = MinCalculator.findMin(50, 2, 50, 50, 50);
        assertEquals(2, result);
    }

    @Test
    void testB_Nominal() {
        int result = MinCalculator.findMin(50, 500, 50, 50, 50);
        assertEquals(50, result);
    }

    @Test
    void testB_Max_min_1() {
        int result = MinCalculator.findMin(50, 999, 50, 50, 50);
        assertEquals(50, result);
    }

    @Test
    void testB_Max() {
        int result = MinCalculator.findMin(50, 1000, 50, 50, 50);
        assertEquals(50, result);
    }

    @Test
    void testB_Max_Plus_1() {
        assertThrows(IllegalArgumentException.class, () -> {
            MinCalculator.findMin(50, 1001, 50, 50, 50);
        });
    }
}