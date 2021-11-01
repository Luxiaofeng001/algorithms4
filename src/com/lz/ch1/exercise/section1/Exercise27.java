package com.lz.ch1.exercise.section1;

/**
 * @author liuzhang
 * @version 13 2021/11/1
 * 本算法参考labuladong的算法小抄
 */
public class Exercise27 {
    private static final int N = 100;
    private static final int K = 50;


    public static double binomial(int N, int K, double p){
        double[][] memo = new double[N + 1][K + 1];
        // 将memo数组中元素初始化为-1
        for (int i = 0; i <= N; i++)
            for (int j = 0; j <= K; j++)
                memo[i][j] = -1.0;
        return helper(memo, N, K, p);
    }

    public static double helper(double[][] memo, int n, int k, double p){
        if (n == 0 && k == 0) memo[n][k] = 1.0;
        if (n < 0 || k < 0) return 0.0;
        if (memo[n][k] != -1.0) return memo[n][k];   // 已经计算过
        memo[n][k] = (1.0 - p) * helper(memo, n-1, k, p) + p * helper(memo, n-1, k-1, p);
        return memo[n][k];
    }

    public static void main(String[] args) {
        System.out.println(binomial(N, K, 0.25));
    }
}
