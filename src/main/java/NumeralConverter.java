import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumeralConverter {

    public static final Character NUMERAL_V = 'V';
    public static final Character NUMERAL_I = 'I';
    public static final Character NUMERAL_X = 'X';

    public static Map<Character, Integer> numeralToValueMap = new HashMap<Character, Integer>();

    public static int convert(String numerals) {
        NumeralConverter.initialiseNumeralToValueMap();
        return sumDecimalValues(calculateDecimalValue(numerals));
    }

    public static void initialiseNumeralToValueMap() {
        NumeralConverter.numeralToValueMap.put(NUMERAL_I, 1);
        NumeralConverter.numeralToValueMap.put(NUMERAL_V, 5);
        NumeralConverter.numeralToValueMap.put(NUMERAL_X, 10);
    }

    public static List<Integer> calculateDecimalValue(String numerals) {
        List<Integer> decimals = convertNumeralsToDecimalList(numerals);

        for (int i = 0; i < decimals.size() -1; i++) {
            Integer currentDecimal = decimals.get(i);
            Integer nextDecimal = decimals.get(i+1);
            if (currentDecimal < nextDecimal) {
                decimals.remove(i);
                decimals.add(-currentDecimal);
            }
        }

        return decimals;
    }

    public static List<Integer> convertNumeralsToDecimalList(String numerals) {
        List<Integer> decimals = new ArrayList<Integer>();

        for (Character numeral:
                numerals.toCharArray()) {
            Integer decimal = convertNumeralToDecimal(numeral);
            decimals.add(decimal);
        }

        return decimals;
    }

    public static Integer convertNumeralToDecimal(Character numeral) {
        return numeralToValueMap.get(numeral);
    }


    public static int sumDecimalValues(List<Integer> decimals) {
        int counter = 0;
        for (Integer decimal :
                decimals) {
            counter += decimal;
        }
        return counter;
    }
}
