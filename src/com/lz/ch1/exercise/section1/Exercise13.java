package com.lz.ch1.exercise.section1;

import java.util.Arrays;

/**
 * @author liuzhang
 * @version 13 2021/10/31
 */
public class Exercise13 {
    public static int[][] Transpoe(int[][] a){
        int[][] b = new int[a[0].length][a.length];
        for (int i = 0; i < b.length; i++){
            for (int j = 0; j < b[i].length; j++){
                b[i][j] = a[j][i];
            }
        }
        return b;
    }

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(Arrays.deepToString(Transpoe(array)));

    }
}
