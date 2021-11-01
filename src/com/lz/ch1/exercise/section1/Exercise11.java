package com.lz.ch1.exercise.section1;

import edu.princeton.cs.algs4.StdOut;
import org.jetbrains.annotations.NotNull;

/**
 * @author liuzhang
 * @version 13 2021/10/31
 */
public class Exercise11 {

    public static void main(String[] args) {
        boolean[][] array = {{true, false, true},
                {false, true, false}};
        System.out.print("  ");
        for (int k = 0; k < array[0].length-1; k++)
            System.out.print(k + " ");
        System.out.println(array[0].length-1);
        printArray(array);
    }

    private static void printArray(boolean[] @NotNull [] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < array[i].length; j++) {

                if (array[i][j]) {
                    StdOut.print("* ");
                } else {
                    StdOut.print("  ");
                }

            }
            StdOut.println();
        }

    }

}
