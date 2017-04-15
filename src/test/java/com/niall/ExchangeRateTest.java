package com.niall;

import junit.framework.TestCase;

/**
 * Created by Niall on 15/04/2017.
 */
public class ExchangeRateTest extends TestCase {
    public void setUp() throws Exception {
        super.setUp();

    }

    public void tearDown() throws Exception {

    }

    public void testGetEuroUsdRate() throws Exception {
        System.out.println("getEuroUsdRate");
        ExchangeRate instance = new ExchangeRate();
        double expResult = instance.getEuroUsdRate();;
        double result = instance.getEuroUsdRate();
        assertEquals(expResult, result, 0.1);
    }

    public void testGetUsdEuroRate() throws Exception {
        System.out.println("getUsdEuroRate");
        ExchangeRate instance = new ExchangeRate();
        double expResult = instance.getUsdEuroRate();
        double result = instance.getUsdEuroRate();
        assertEquals(expResult, result, 0.1);
    }

    public void testGetEuroGBPRate() throws Exception {
        System.out.println("getEuroGBPRate");
        ExchangeRate instance = new ExchangeRate();
        double expResult = instance.getEuroGBPRate();
        double result = instance.getEuroGBPRate();
        assertEquals(expResult, result, 0.1);
    }

    public void testGetGBPEuroRate() throws Exception {
        System.out.println("getGBPEuroRate");
        ExchangeRate instance = new ExchangeRate();
        double expResult = instance.getGBPEuroRate();
        double result = instance.getGBPEuroRate();
        assertEquals(expResult, result, 0.1);
    }

}