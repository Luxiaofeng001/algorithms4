package com.lz.ch1.exercise.section1;

/**
 * @author liuzhang
 * @version 13 2021/11/1
 */
public class Exercise18 {
    public static int mystery(int a, int b){
        if (b == 0) return 1;
        if (b % 2 == 0) return mystery(a*a, b/2);
        return mystery(a*a, b/2) * a;
    }

    public static void main(String[] args) {
        System.out.println(mystery(2, 10));
        System.out.println(mystery(3, 11));

    }
}
