import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class NumeralConverter {

    public static final Character NUMERAL_V = 'V';
    public static final Character NUMERAL_I = 'I';
    public static final Character NUMERAL_X = 'X';

    public static Map<Character, Integer> numeralToValueMap = new HashMap<Character, Integer>();

    public static int convert(String numerals) {
        NumeralConverter.initialiseNumeralToValueMap();
        return sumDecimalValues(convertToDecimalList(numerals));
    }

    public static void initialiseNumeralToValueMap() {
        NumeralConverter.numeralToValueMap.put(NUMERAL_I, 1);
        NumeralConverter.numeralToValueMap.put(NUMERAL_V, 5);
        NumeralConverter.numeralToValueMap.put(NUMERAL_X, 10);
    }

    public static List<Integer> convertToDecimalList(String numerals) {
        List<Integer> decimals = new ArrayList<Integer>();

        for (Character numeral:
             numerals.toCharArray()) {
            Integer decimal = convertNumeralToDecimal(numeral);
            decimals.add(decimal);
        }

        for (int i = 0; i < decimals.size() -1; i++) {
            Integer currentDecimal = decimals.get(i);
            Integer nextDecimal = decimals.get(i+1);
            if (currentDecimal < nextDecimal) {
                decimals.remove(i);
                decimals.add(-currentDecimal);
            }
        }
        System.out.println(decimals);
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
