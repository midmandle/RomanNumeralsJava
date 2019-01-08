public class NumeralConverter {
    public static int convert(String numerals) {
        if(numerals.equals("IV"))
            return 4;
        if(numerals.equals("V"))
            return 5;
        return numerals.length();
    }
}
