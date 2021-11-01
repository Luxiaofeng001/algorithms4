package com.lz.ch1.exercise.section1;

/**
 * @author liuzhang
 * @version 13 2021/11/1
 */
public class Exercise20 {
    public static double lnOfNFactorial(int N){
        if (N == 1) return 0.0;
        // 注意，ln(n!) = ln(n) + ln(n-1) + ... + ln(2) + ln(1)
        return Math.log(N) + lnOfNFactorial(N-1);
    }

    public static void main(String[] args) {
        System.out.println(lnOfNFactorial(300));
    }
}
