import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConvertsSingleNumeralToDecimalTest {
    @Test
    public void converts_numeral_I_to_decimal_1() {
        assertEquals(1, NumeralConverter.convert("I"));
    }

    @Test
    public void converts_numerals_II_to_decimal_2() {
        assertEquals(2, NumeralConverter.convert("II"));
    }
}
