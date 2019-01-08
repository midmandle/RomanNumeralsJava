import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConvertsNumeralsToDecimalTest {
    @Test
    public void converts_numeral_I_to_decimal_1() {
        assertEquals(1, NumeralConverter.convert("I"));
    }

    @Test
    public void converts_numerals_II_to_decimal_2() {
        assertEquals(2, NumeralConverter.convert("II"));
    }

    @Test
    public void converts_numerals_III_to_decimal_3() {
        assertEquals(3, NumeralConverter.convert("III"));
    }

    @Test
    public void converts_numeral_V_to_decimal_5() {
        assertEquals(5, NumeralConverter.convert("V"));
    }
}
