package com.lz.ch1.exercise.section1;

import edu.princeton.cs.algs4.StdOut;

/**
 * @author liuzhang
 * @version 13 2021/10/31
 */
public class Exercise7 {
    public static void main(String[] args) {
        RootOfNine();
        SumTo999();
        SumOf2Power();
    }

    private static void RootOfNine(){
        double t = 9.0;
        while (Math.abs(t - 9.0/t) > .001)
            t = (9.0/t + t) / 2.0;
        StdOut.printf("%.5f\n", t);
    }

    private static void SumTo999() {
        int sum = 0;
        for (int i = 1; i < 1000; i++)
            for (int j = 0; j < i; j++)
                sum++;
        StdOut.println(sum);
    }

    private static void SumOf2Power() {
        int sum = 0;
        for (int i = 1; i < 1000; i *= 2)
            for (int j = 0; j < i; j++)
                sum++;
        StdOut.println(sum);
    }
}
