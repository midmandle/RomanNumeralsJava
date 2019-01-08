import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class ConvertsNumeralsToDecimalTest {

    @Test
    @Parameters({
            "I, 1",
            "II, 2",
            "III, 3",
            "V, 5",
            "IV, 4",
            "VI, 6",
            "VII, 7",
            "VIII, 8",
            "IX, 9",
            "X, 10",
            "XI, 11",
            "XII, 12",
            "XIII, 13",
            "XIV, 14",
            "L, 50",
            "XL, 40",
            "XLV, 45",
            "XLIV, 44",
            "C, 100",
    })
    public void converts_numerals_to_decimal(String numeral, int decimal) {
        assertEquals(decimal, NumeralConverter.convert(numeral));
    }
}
