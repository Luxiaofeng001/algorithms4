package com.lz.ch1.exercise.section1;

/**
 * @author liuzhang
 * @version 13 2021/11/1
 */
public class Exercise15 {
    public static int[] histogram(int[] a, int M){
        int[] b = new int[M];
        for (int i = 0; i < M; i++){
            int count = 0;
            for (int k : a) if (k == i) count++;
            b[i] = count;
        }
        return b;
    }

    public static void main(String[] args) {
        int[] a = {0, 1, 1, 2, 1, 0};
        int[] b = histogram(a, 3);
        for (int bb : b) System.out.println(bb);
    }
}
