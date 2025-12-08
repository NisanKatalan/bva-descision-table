package bva_desciisionTable.bva_desciisionTable;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class MinCalculatorTest {
    
	 @Test
	    void testAIsZero_shouldThrowException() {
	        // arrange
	        int a = 0;   // ערך לא חוקי
	        int b = 50;
	        int c = 50;
	        int d = 50;
	        int e = 50;

	        // act + assert
	        assertThrows(IllegalArgumentException.class, () -> {
	        	MinCalculator.findMin(a, b, c, d, e);
	        });
	    }

	 @Test
	    void testAIsOne_shouldReturnMinimum() {
	        // arrange
	        int a = 10;    // ערך גבול תקין
	        int b = 50;
	        int c = 50;
	        int d = 50;
	        int e = 50;

	        // act
	        int result = MinCalculator.findMin(a, b, c, d, e);

	        // assert
	        assertEquals(10, result);   // 1 הוא הערך המינימלי
	    }
	@Test
    void testB_ValueZero_ShouldThrowException() {
        assertThrows(IllegalArgumentException.class, () -> {
            MinCalculator.findMin(50, 0, 50, 50, 50);
        });
    }

    @Test
    void testB_ValueOne_ShouldReturnOne() {
        int result = MinCalculator.findMin(50, 1, 50, 50, 50);
        assertEquals(1, result);
    }

    @Test
    void testB_ValueTwo_ShouldReturnTwo() {
        int result = MinCalculator.findMin(50, 2, 50, 50, 50);
        assertEquals(2, result);
    }

    @Test
    void testB_Value500_ShouldReturnFifty() {
        int result = MinCalculator.findMin(50, 500, 50, 50, 50);
        assertEquals(50, result);
    }

    @Test
    void testB_Value999_ShouldReturnFifty() {
        int result = MinCalculator.findMin(50, 999, 50, 50, 50);
        assertEquals(50, result);
    }

    @Test
    void testB_Value1000_ShouldReturnFifty() {
        int result = MinCalculator.findMin(50, 1000, 50, 50, 50);
        assertEquals(50, result);
    }

    @Test
    void testB_Value1001_ShouldThrowException() {
        assertThrows(IllegalArgumentException.class, () -> {
            MinCalculator.findMin(50, 1001, 50, 50, 50);
        });
		
	
	}}
