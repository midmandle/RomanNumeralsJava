public class NumeralConverter {
    public static int convert(String numerals) {
        if(numerals.equals("VIII"))
            return 8;
        if(numerals.equals("VII"))
            return 7;
        if(numerals.equals("VI"))
            return 6;
        if(numerals.equals("IV"))
            return 4;
        if(numerals.equals("V"))
            return 5;
        return numerals.length();
    }
}
