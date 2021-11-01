package com.lz.ch1.exercise.section1;

import edu.princeton.cs.algs4.StdOut;

/**
 * @author liuzhang
 * @version 13 2021/11/1
 */
public class Exercise24 {
    public static int gcd(int p, int q, int depth){
        if (depth == 0){
            StdOut.printf("The 0-th recurrence: p=%d, q=%d\n", p, q);
        }

        for (int i = 0; i < depth; i++) {
            StdOut.print("  ");
        }

        if (depth != 0) {
                StdOut.printf("The %d-th recurrence: p=%d, q=%d\n", depth, p, q);
        }
        if (q == 0) return p;
        int r = p % q;
        return gcd(q, r, ++depth);
    }

    public static void main(String[] args) {
        int p = Integer.parseInt(args[0]);
        int q = Integer.parseInt(args[1]);
        System.out.println(gcd(p, q, 0));
    }
}
