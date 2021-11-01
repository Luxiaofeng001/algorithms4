package com.lz.ch1.exercise.section1;

/**
 * @author liuzhang
 * @version 13 2021/10/31
 */
public class Exercise14 {
    public static Object lg(int N){
        if (N == 0) return Integer.MIN_VALUE;
        int m = 1;
        int i = 0;
        while (2 * m <= N){
            m *= 2;
            i++;
        }
        return i;
    }

    public static void main(String[] args) {
        int N = 10;
        System.out.println(lg(0));
    }
}
