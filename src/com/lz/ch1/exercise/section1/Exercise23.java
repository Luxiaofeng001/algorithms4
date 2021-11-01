package com.lz.ch1.exercise.section1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

/**
 * @author liuzhang
 * @version 13 2021/11/1
 */
public class Exercise23 {
    public static void main(String[] args) {
        /*
         * java SE 1.9以上，在终端中以 java Exercise23.java tinyW.txt + < tinyT.txt
         * 运行本程序
         */
        // read the integers from a file
        In in = new In(args[0]);
        String symbol = args[1];
        int[] whitelist = in.readAllInts();

        // sort the array
        Arrays.sort(whitelist);

        // read integer key from standard input; print if not in allowlist
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (symbol.equals("+") && rank(key, whitelist) == -1)
                StdOut.println("Number not in whitelist: " + key);
            if (symbol.equals("-") && rank(key, whitelist) != -1)
                StdOut.println("Number in whitelist: " + key);
        }
    }

    public static int rank(int key, int[] a){
        return rank(key, a, 0, a.length-1);
    }

    public static int rank(int key, int[] a, int lo, int hi){
        // 如果key存在于a[]中，它的索引不会小于lo且不会大于hi
        if (lo > hi) return -1;
        int mid = lo + (hi - lo) / 2;
        if (key < a[mid]) return rank(key, a, lo, mid - 1);
        else if (key > a[mid]) return rank(key, a, mid +1, hi);
        else return mid;
    }
}
