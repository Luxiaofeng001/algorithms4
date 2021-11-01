package com.lz.ch1.exercise.section1;

import java.util.Scanner;

/**
 * @author liuzhang
 * @version 13 2021/10/31
 */
public class Exercise1To5 {
    public static void main(String[] args) {
        System.out.println((0 + 15) / 2);  //1.a
        System.out.println(2.0e-6 * 100000000.1);  //1.b
        System.out.println(true && false || true & true);  //1.c
        System.out.println((1 + 2.236) / 2);   //2.a
        System.out.println(1 + 2 + 3 + 4.0);  //2.b
        System.out.println(4.1 >= 4);  //2.c
        System.out.println(1 + 2 + "3");  //2.d
        // 3, 使用命令行获取参数
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        if (a == b && b== c)
            System.out.println("equal");
        else
            System.out.println("not equal");
        // 5 从键盘读取x和 y
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        System.out.println(x > 0 && x < 1 && y > 0 && y < 1);
    }
}
