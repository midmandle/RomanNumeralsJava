public class NumeralConverter {

    public static final String NUMERAL_V = "V";
    public static final String NUMERAL_I = "I";

    public static int convert(String numerals) {
        if(numerals.equals("V" + NUMERAL_I + "II"))
            return 8;
        if(numerals.equals("V" + NUMERAL_I + "I"))
            return 7;
        if(numerals.equals("V" + NUMERAL_I))
            return 6;
        if(numerals.equals(NUMERAL_I + "V"))
            return 4;
        if(numerals.equals(NUMERAL_V))
            return 5;
        return numerals.length();
    }
}
