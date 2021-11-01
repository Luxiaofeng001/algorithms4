package com.lz.ch1.exercise.section1;

/**
 * @author liuzhang
 * @version 13 2021/11/1
 */
public class Exercise19 {
    private static final int M = 100;
    static long[] memo = new long[M];

    public static long fib(int N){
        for (int i = 1; i < memo.length; i++)
            memo[i] = -1;
        return helper(memo, N);
    }


    public static long helper(long[] memo, int n){
        if (n == 0) memo[n] = 0;
        if (n == 1) memo[n] = 1;
        if (memo[n] != -1) return memo[n];   // 已经计算过
        memo[n] = helper(memo, n-1) + helper(memo, n-2);
        return memo[n];
    }

    public static void main(String[] args) {
        for (int N = 0; N < 100; N++)
            System.out.println(N + " " +fib(N));
    }
}
