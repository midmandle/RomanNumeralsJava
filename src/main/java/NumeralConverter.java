public class NumeralConverter {

    public static final String NUMERAL_V = "V";
    public static final String NUMERAL_I = "I";
    public static final String NUMERAL_X = "X";

    public static int convert(String numerals) {
        if(numerals.equals(NUMERAL_X))
            return 10;
        if(numerals.equals(NUMERAL_I + NUMERAL_X))
            return 9;
        if(numerals.equals(NUMERAL_V + NUMERAL_I + NUMERAL_I + NUMERAL_I))
            return 8;
        if(numerals.equals(NUMERAL_V + NUMERAL_I + NUMERAL_I))
            return 7;
        if(numerals.equals(NUMERAL_V + NUMERAL_I))
            return 6;
        if(numerals.equals(NUMERAL_I + NUMERAL_V))
            return 4;
        if(numerals.equals(NUMERAL_V))
            return 5;
        return numerals.length();
    }
}
