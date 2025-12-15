package bva_desciisionTable.bva_desciisionTable;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CoinDecisionTest {

    @Test
    void testR1() {
        String result = CoinDecision.CoinDecision("H", "T", "T", "H");
        assertEquals("Positive", result);
    }

    @Test
    void testR2() {
        String result = CoinDecision.CoinDecision("T", "T", "T", "T");
        assertEquals("Negative", result);
    }

    @Test
    void testR3() {
        String result = CoinDecision.CoinDecision("H", "H", "H", "H");
        assertEquals("Positive", result);
    }

    @Test
    void testR4() {
        String result = CoinDecision.CoinDecision("T", "H", "H", "H");
        assertEquals("Positive", result);
    }

    @Test
    void testR5() {
        String result = CoinDecision.CoinDecision("H", "T", "T", "T");
        assertEquals("Negative", result);
    }
}