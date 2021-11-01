package com.lz.ch1.exercise.section1;

import edu.princeton.cs.algs4.StdOut;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author liuzhang
 * @version 13 2021/11/1
 */
public class Exercise28 {
    public static void main(String[] args) {
        int[] whitelist = {23, 34, 15, 44, 16, 16, 23, 41, 29};
        int[] keys = {23, 44, 20};

        // sort the array
        Arrays.sort(whitelist);
        // 去重白名单
        int[] compactWhitelist = removeDuplicates(whitelist);

        // 打印去重后的白名单中的元素
        for (int w : compactWhitelist) System.out.println(w);

        // 打印keys中不在去重白名单中的元素
        for (int key : keys) {
            if (rank(key, compactWhitelist) != -1)
                StdOut.println("Number not in whitelist: " + key);
        }
    }

    private static int[] removeDuplicates(int[] whitelist) {
        var arrayList = new ArrayList<Integer>();
        for (int j : whitelist) {
            if (!arrayList.contains(j))
                arrayList.add(j);
        }
        int[] compactList = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++)
            compactList[i] = arrayList.get(i);
        return compactList;
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
