package com.lz.ch1;

/**
 * @author liuzhang
 * @version 13 2021/10/30
 */
public class NewtonSqrt {
    public static double sqrt(double c) {
        double err = 1e-15;
        double t = c;
        while (Math.abs(t - c / t) > err * t)
            t = (c / t + t) / 2.0;
        return t;
    }

    public static void main(String[] args) {
        double c = 0;
        System.out.println(sqrt(c));
    }
}
