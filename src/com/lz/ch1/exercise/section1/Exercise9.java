package com.lz.ch1.exercise.section1;

/**
 * @author liuzhang
 * @version 13 2021/10/31
 */
public class Exercise9 {
    public static String ToBinaryS(int N){
        StringBuilder s = new StringBuilder();
        for (int n = N; n > 0; n /= 2)
            s.append(n % 2);
        return s.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(ToBinaryS(32));
    }
}
