package com.niall;
/**
 *
 * @author niall
 * Conversions which are used in the FormulasUI class
 */
public class Conversions {
    public static double InToCm(double inch)
    {
        double answer = inch * 2.54;
        return answer;
    }
    //decimal to hex code from http://introcs.cs.princeton.edu/java/31datatype/Hex2Decimal.java.html
    public static String decimalToHex(int d) 
    {
        String digits = "0123456789ABCDEF";
        if (d == 0) return "0";
        String hex = "";
        while (d > 0) {
            int digit = d % 16;                // rightmost digit
            hex = digits.charAt(digit) + hex;  // string concatenation
            d = d / 16;
        }
        return hex;
    }
    //hex to decimal code from http://introcs.cs.princeton.edu/java/31datatype/Hex2Decimal.java.html
    public static int hexToDecimal(String s) 
    {
        String digits = "0123456789ABCDEF";
        s = s.toUpperCase();
        int val = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int d = digits.indexOf(c);
            val = 16*val + d;
        }
        return val;
    }
    public static double FahrenheitToCelius(double fTemp)
    {
        double answer = ((fTemp-32) * 0.5556);
        return answer;
    }
    public static double CelciusToFahrenheit(double cTemp)
    {
        double answer = ((cTemp*1.8)+32);
        return answer;
    }
    public static float EuroToDollar(float euro, double rateUsd)
    {
        float answer = (float) (euro*rateUsd);
        return answer;
    }
    public static float DollarToEuro(float dollar, double rateEuro)
    {   
        float answer = (float) (dollar*rateEuro);
        return answer;
    }
    public static float EuroToGBP(float euro, double rateEuro)
    {
        float answer = (float) (euro*rateEuro);
        return answer;
    }
    public static float GBPToEuro(float pound, double ratePound)
    {
        float answer = (float) (pound*ratePound);
        return answer;
    }
    
}
