import java.util.HashMap;
import java.util.Map;

public class NumeralConverter {

    public static final Character NUMERAL_V = 'V';
    public static final Character NUMERAL_I = 'I';
    public static final Character NUMERAL_X = 'X';

    public static Map<Character, Integer> numeralToValueMap = new HashMap<Character, Integer>();

    public static int convert(String numerals) {
        NumeralConverter.initialiseNumeralToValueMap();
        if(numerals.equals("" + NUMERAL_X + NUMERAL_I + NUMERAL_V))
            return 14;
        if(numerals.equals("" + NUMERAL_X + NUMERAL_I + NUMERAL_I + NUMERAL_I))
            return sumDecimalValues(numeralToValueMap.get(NUMERAL_X), numeralToValueMap.get(NUMERAL_I), numeralToValueMap.get(NUMERAL_I), numeralToValueMap.get(NUMERAL_I));
        if(numerals.equals("" + NUMERAL_X + NUMERAL_I + NUMERAL_I))
            return sumDecimalValues(numeralToValueMap.get(NUMERAL_X), numeralToValueMap.get(NUMERAL_I), numeralToValueMap.get(NUMERAL_I));
        if(numerals.equals("" + NUMERAL_X + NUMERAL_I))
            return sumDecimalValues(numeralToValueMap.get(NUMERAL_X), numeralToValueMap.get(NUMERAL_I));
        if(numerals.equals("" + NUMERAL_X))
            return sumDecimalValues(numeralToValueMap.get(NUMERAL_X));
        if(numerals.equals("" + NUMERAL_I + NUMERAL_X))
            return 9;
        if(numerals.equals("" + NUMERAL_V + NUMERAL_I + NUMERAL_I + NUMERAL_I))
            return sumDecimalValues(numeralToValueMap.get(NUMERAL_V), numeralToValueMap.get(NUMERAL_I), numeralToValueMap.get(NUMERAL_I), numeralToValueMap.get(NUMERAL_I));
        if(numerals.equals("" + NUMERAL_V + NUMERAL_I + NUMERAL_I))
            return sumDecimalValues(numeralToValueMap.get(NUMERAL_V), numeralToValueMap.get(NUMERAL_I), numeralToValueMap.get(NUMERAL_I));
        if(numerals.equals("" + NUMERAL_V + NUMERAL_I))
            return sumDecimalValues(numeralToValueMap.get(NUMERAL_V), numeralToValueMap.get(NUMERAL_I));
        if(numerals.equals("" + NUMERAL_I + NUMERAL_V))
            return 4;
        if(numerals.equals("" + NUMERAL_V))
            return sumDecimalValues(numeralToValueMap.get(NUMERAL_V));
        return numerals.length();
    }

    public static void initialiseNumeralToValueMap() {
        NumeralConverter.numeralToValueMap.put(NUMERAL_I, 1);
        NumeralConverter.numeralToValueMap.put(NUMERAL_V, 5);
        NumeralConverter.numeralToValueMap.put(NUMERAL_X, 10);
    }

    public static int sumDecimalValues(Integer ...decimals) {
        int counter = 0;
        for (Integer decimal :
                decimals) {
            counter += decimal;
        }
        return counter;
    }
}
