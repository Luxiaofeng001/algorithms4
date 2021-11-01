package com.lz.ch1;

/**
 * @author liuzhang
 * @version 13 2021/10/30
 */
public class HarmonicSeries {
    public static double H(int N){
        double sum = 0.0;
        for (int i = 1; i <= N; i++)
            sum += 1.0 / i;
        return sum;
    }

    public static void main(String[] args) {
        int N = 10;
        System.out.println(H(1000000000));
    }
}
