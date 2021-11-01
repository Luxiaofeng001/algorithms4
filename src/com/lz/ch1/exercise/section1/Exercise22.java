package com.lz.ch1.exercise.section1;

import edu.princeton.cs.algs4.StdOut;

/**
 * @author liuzhang
 * @version 13 2021/11/1
 */
public class Exercise22 {
    public static void main(String[] args) {
        int[] a = {2, 3, 6, 8, 13, 22, 25};
        int key = 5;
        StdOut.println(rank(key, a));
    }

    public static int rank(int key, int[] a){
        return rank(key, a, 0, a.length-1, 0);
    }

    public static int rank(int key, int[] a, int lo, int hi, int depth){
        if (depth == 0){
            StdOut.printf("The 0-th recurrence: lo=%d, hi=%d\n", lo, hi);
        }

        for (int i = 0; i < depth; i++) {
            StdOut.print("  ");
        }

        if (depth != 0) {
            StdOut.printf("The %d-th recurrence: lo=%d, hi=%d\n", depth, lo, hi);
        }
        // 如果key存在于a[]中，它的索引不会小于lo且不会大于hi
        if (lo > hi) return -1;
        int mid = lo + (hi - lo) / 2;
        if (key < a[mid]) return rank(key, a, lo, mid - 1, depth+1);
        else if (key > a[mid]) return rank(key, a, mid +1, hi, depth+1);
        else return mid;
    }
}
