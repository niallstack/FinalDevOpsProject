package com.niall;

import junit.framework.TestCase;

/**
 * Created by Niall on 15/04/2017.
 */
public class ConversionsTest extends TestCase {
    public void setUp() throws Exception {
        super.setUp();

    }

    public void tearDown() throws Exception {

    }

    public void testInToCm() throws Exception {
        System.out.println("InToCm");
        double inch = 67.0;
        double expResult = 170.18;
        double result = Conversions.InToCm(inch);
        assertEquals(expResult, result, 0.0);
    }

    public void testDecimalToHex() throws Exception {
        System.out.println("decimalToHex");
        int d = 45;
        String expResult = "2D";
        String result = Conversions.decimalToHex(d);
        assertEquals(expResult, result);
    }

    public void testHexToDecimal() throws Exception {
        System.out.println("hexToDecimal");
        String s = "457FFB";
        int expResult = 4554747;
        int result = Conversions.hexToDecimal(s);
        assertEquals(expResult, result);
    }

    public void testFahrenheitToCelius() throws Exception {
        System.out.println("FahrenheitToCelius");
        double fTemp = 678.0;
        double expResult = 358.889;
        double result = Conversions.FahrenheitToCelius(fTemp);
        assertEquals(expResult, result, 0.1);
    }

    public void testCelciusToFahrenheit() throws Exception {
        System.out.println("CelciusToFahrenheit");
        double cTemp = 56.0;
        double expResult = 132.8;
        double result = Conversions.CelciusToFahrenheit(cTemp);
        assertEquals(expResult, result, 0.0);
    }

    public void testEuroToDollar() throws Exception {
        System.out.println("EuroToDollar");
        float euro = 3.0F;
        double rateUsd = 1.0;
        float expResult = 3.0F;
        float result = Conversions.EuroToDollar(euro, rateUsd);
        assertEquals(expResult, result, 0.0);
    }

    public void testDollarToEuro() throws Exception {
        System.out.println("DollarToEuro");
        float dollar = 3.0F;
        double rateEuro = 1.0;
        float expResult = 3.0F;
        float result = Conversions.DollarToEuro(dollar,rateEuro);
        assertEquals(expResult, result, 0.0);
    }

    public void testEuroToGBP() throws Exception {
        System.out.println("EuroToGBP");
        float euro = 5.0F;
        double rateEuro = 2.0;
        float expResult = 10.0F;
        float result = Conversions.EuroToGBP(euro, rateEuro);
        assertEquals(expResult, result, 0.0);
    }

    public void testGBPToEuro() throws Exception {
        System.out.println("GBPToEuro");
        float pound = 6.0F;
        double ratePound = 1.0;
        float expResult = 6.0F;
        float result = Conversions.GBPToEuro(pound, ratePound);
        assertEquals(expResult, result, 0.0);
    }

}