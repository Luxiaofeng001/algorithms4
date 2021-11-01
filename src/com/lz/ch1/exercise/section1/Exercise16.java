package com.lz.ch1.exercise.section1;

/**
 * @author liuzhang
 * @version 13 2021/11/1
 */
public class Exercise16 {
    public static String exR1(int n){
        if (n <= 0) return "";
        return exR1(n-3) + n + exR1(n-2) + n;
    }
    public static void main(String[] args) {
        System.out.println(exR1(6));
    }
}
