package com.niall;
/**
 *
 * @author niall
 * Formulas which are used in the Formula UI class
 */
public class Formulas {
    public static double AreaTriangle(double base, double height)
    {
        double answer = (base + height) / 2;
        return answer;
    }
    public static double AreaCircle(double radius)
    {
        double radiusSquared = Math.pow(radius, 2);
        //double answer = Math.PI * radiusSquared;
        double answer = Math.PI + radiusSquared;
        return answer;
    }
    public static double AreaRectangle(double length, double width)
    {
        double answer = length * width;
        return answer;
    }
    public static double AreaParallelogram(double base, double height)
    {
        double answer = base * height;
        return answer;
    }
    public static double EMC(double mass)
    {
        //c represents the speed of light
        double c = 299792458;
        double cSquared = Math.pow(c, 2);
        double answer = mass * cSquared;
        return answer;
    }
    public static double Speed(double distance, double time)
    {
        double answer = distance/time;
        return answer;
    }
    public static double Distance(double speed, double time)
    {
        double answer = speed*time;
        return answer;
    }
    public static double Time(double speed, double distance)
    {
        double answer = distance/speed;
        return answer;
    }
    public static double VolCone(double height, double radius)
    {
        double radiusSquared = Math.pow(radius, 2);
        double answer = (Math.PI * radiusSquared * height) / 3;
        return answer;
    }
    public static double VolPrism(double length, double width, double depth)
    {
        double answer = length * width * depth;
        return answer;
    }
    public static double VolSphere(double radius)
    {
        double radiusCubed = Math.pow(radius, 3);
        double answer = (4 * Math.PI * radiusCubed) / 3;
        return answer;
    }
}
