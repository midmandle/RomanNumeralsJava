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
        if(numerals.equals("" + NUMERAL_X + NUMERAL_I + NUMERAL_V))
            return 14;
        if(numerals.equals("" + NUMERAL_I + NUMERAL_X))
            return 9;
        if(numerals.equals("" + NUMERAL_I + NUMERAL_V))
            return 4;
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
