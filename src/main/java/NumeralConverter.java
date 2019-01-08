import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumeralConverter {

    private static final Character NUMERAL_V = 'V';
    private static final Character NUMERAL_I = 'I';
    private static final Character NUMERAL_X = 'X';
    private static final Character NUMERAL_L = 'L';
    private static final Character NUMERAL_C = 'C';
    private static final Character NUMERAL_D = 'D';
    private static final Character NUMERAL_M = 'M';

    private Map<Character, Integer> numeralToValueMap = new HashMap<Character, Integer>();

    public NumeralConverter() {
        initialiseNumeralToValueMap();
    }

    public int convert(String numerals) {
        return sumDecimalValues(calculateDecimalValue(numerals));
    }

    private void initialiseNumeralToValueMap() {
        numeralToValueMap.put(NUMERAL_I, 1);
        numeralToValueMap.put(NUMERAL_V, 5);
        numeralToValueMap.put(NUMERAL_X, 10);
        numeralToValueMap.put(NUMERAL_L, 50);
        numeralToValueMap.put(NUMERAL_C, 100);
        numeralToValueMap.put(NUMERAL_D, 500);
        numeralToValueMap.put(NUMERAL_M, 1000);
    }

    private List<Integer> calculateDecimalValue(String numerals) {
        List<Integer> decimals = convertNumeralsToDecimalList(numerals);

        for (int i = 0; i < decimals.size() -1; i++) {
            Integer currentDecimal = decimals.get(i);
            Integer nextDecimal = decimals.get(i+1);
            if (decimalShouldBeNegative(currentDecimal, nextDecimal))
                decimals = replaceDecimalWithNegative(decimals, i);
        }

        return decimals;
    }

    private List<Integer> convertNumeralsToDecimalList(String numerals) {
        List<Integer> decimals = new ArrayList<Integer>();

        for (Character numeral: numerals.toCharArray()) {
            Integer decimal = convertNumeralToDecimal(numeral);
            decimals.add(decimal);
        }

        return decimals;
    }

    private List<Integer> replaceWithNegativeDecimalWhereNecessary(List<Integer> decimals) {
        for (int i = 0; i < decimals.size() -1; i++) {
            Integer currentDecimal = decimals.get(i);
            Integer nextDecimal = decimals.get(i+1);
            if (decimalShouldBeNegative(currentDecimal, nextDecimal))
                decimals = replaceDecimalWithNegative(decimals, i);
        }

        return decimals;
    }

    private boolean decimalShouldBeNegative(Integer currentDecimal, Integer nextDecimal) {
       return currentDecimal < nextDecimal;
    }

    private List<Integer> replaceDecimalWithNegative(List<Integer> decimals, int indexToChangeToNegative) {
        Integer currentDecimal = decimals.get(indexToChangeToNegative);
        decimals.set(indexToChangeToNegative, -currentDecimal);

        return decimals;
    }

    private Integer convertNumeralToDecimal(Character numeral) {
        return numeralToValueMap.get(numeral);
    }


    private int sumDecimalValues(List<Integer> decimals) {
        int counter = 0;
        for (Integer decimal : decimals) {
            counter += decimal;
        }

        return counter;
    }
}
