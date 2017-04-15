package com.niall;

import junit.framework.TestCase;

/**
 * Created by Niall on 15/04/2017.
 */
public class FormulasTest extends TestCase {
    public void setUp() throws Exception {
        super.setUp();

    }

    public void tearDown() throws Exception {

    }

    public void testAreaTriangle() throws Exception {
        System.out.println("AreaTriangle");
        double base = 4.0;
        double height = 8.0;
        double expResult = 16.0;
        double result = Formulas.AreaTriangle(base, height);
        assertEquals(expResult, result, 0.0);
    }

    public void testAreaCircle() throws Exception {
        System.out.println("AreaCircle");
        double radius = 6.0;
        double expResult = 39.1;
        double result = Formulas.AreaCircle(radius);
        assertEquals(expResult, result, 1.0);
    }

    public void testAreaRectangle() throws Exception {
        System.out.println("AreaRectangle");
        double length = 7.0;
        double width = 4.0;
        double expResult = 28.0;
        double result = Formulas.AreaRectangle(length, width);
        assertEquals(expResult, result, 0.0);
    }

    public void testAreaParallelogram() throws Exception {
        System.out.println("AreaParallelogram");
        double base = 3.0;
        double height = 7.0;
        double expResult = 21.0;
        double result = Formulas.AreaParallelogram(base, height);
        assertEquals(expResult, result, 0.0);
    }

    public void testEMC() throws Exception {
        System.out.println("EMC");
        double mass = 3.0;
        double expResult = 269626553621050000.0;
        double result = Formulas.EMC(mass);
        assertEquals(expResult, result, 10000.0);
    }

    public void testSpeed() throws Exception {
        System.out.println("Speed");
        double distance = 10.0;
        double time = 4.0;
        double expResult = 2.5;
        double result = Formulas.Speed(distance, time);
        assertEquals(expResult, result, 0.0);
    }

    public void testDistance() throws Exception {
        System.out.println("Distance");
        double speed = 4.0;
        double time = 7.0;
        double expResult = 28.0;
        double result = Formulas.Distance(speed, time);
        assertEquals(expResult, result, 0.0);
    }

    public void testTime() throws Exception {
        System.out.println("Time");
        double speed = 6.6;
        double distance = 30.9;
        double expResult = 4.68;
        double result = Formulas.Time(speed, distance);
        assertEquals(expResult, result, 0.02);
    }

    public void testVolCone() throws Exception {
        System.out.println("VolCone");
        double height = 5.0;
        double radius = 4.0;
        double expResult = 83.78;
        double result = Formulas.VolCone(height, radius);
        assertEquals(expResult, result, 0.02);
    }

    public void testVolPrism() throws Exception {
        System.out.println("VolPrism");
        double length = 4.0;
        double width = 5.0;
        double depth = 7.0;
        double expResult = 140.0;
        double result = Formulas.VolPrism(length, width, depth);
        assertEquals(expResult, result, 0.0);
    }

    public void testVolSphere() throws Exception {
        System.out.println("VolSphere");
        double radius = 5.0;
        double expResult = 523.6;
        double result = Formulas.VolSphere(radius);
        assertEquals(expResult, result, 0.02);
    }

}