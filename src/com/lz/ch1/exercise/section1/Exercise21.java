package com.lz.ch1.exercise.section1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.ArrayList;

/**
 * @author liuzhang
 * @version 13 2021/11/1
 */
public class Exercise21 {
    public static void main(String[] args) {
        ArrayList<String[]> sites = new ArrayList<>();
        while (!StdIn.isEmpty()) {
            String line = StdIn.readLine();
            String[] values = line.split(" ");
            sites.add(values);
        }
        System.out.printf("%15s  %8s  %6s  %5s\n", "name", "Weight", "Hegiht", "BMI(H/W^2)");
        for (String[] value : sites) formatted(value);
    }

    private static void formatted(String[] values) {

        StdOut.printf("%15s", values[0]);
        StdOut.printf("%8s", values[1]);
        StdOut.printf("%8s", values[2]);

        double value1 = Double.parseDouble(values[1]);
        double value2 = Double.parseDouble(values[2]);
        double result = value1 / (value2 * value2);
        StdOut.printf("%12.3f\n", result);
    }
}
