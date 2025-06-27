package main.java.com.lld.foodsearch;

import java.util.Arrays;

public class Main {
    static int res;

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{};
        int k = 2;
        int res = sortArray(arr, k);
        System.out.println(res);
    }

    //table -> user Detail

    public static int sortArray(Integer[] arr, int k) {
        int n = arr.length;
        if(k > n) {
            return -1;
        }
        Arrays.sort(arr, (a, b) -> b - a);
        return arr[k - 1];
    }

    public static void main1(String[] args) {
        int[] arr = new int[]{3, 6, 7, 11};
        res = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            max = Math.max(max, i);
        }
        minX(arr, 9, 1, max);
        System.out.println(res);
    }

    public static int maxSum(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        if (arr.length == 1) {
            return arr[0];
        }
        int temp = 0;
        int res1 = Integer.MIN_VALUE;
        int res2 = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            temp = temp + arr[i];
            res1 = Math.max(res1, temp);
            if (temp < 0) {
                temp = 0;
            }
        }

        int n = arr.length;
        int i = 1;
        temp = 0;
        do {
            temp = temp + arr[i];
            res2 = Math.max(res1, temp);
            if (temp < 0) {
                temp = 0;
            }

            i = (i + 1) % n;
        } while ((i != 1));
//        System.out.println(res2);

        return Math.max(res1, res2);
    }

    public static void minX(int[] arr, int T, int s, int e) {
        if (s > e) {
            return;
        }
        int x = (s + e) / 2;
        int time = findTime(arr, x);
        if (time > T) {
            minX(arr, T, x + 1, e);
        } else if (time < T) {
            res = Math.min(res, x);
            minX(arr, T, s, x - 1);
        } else {
            res = x;
        }
    }

    public static int findTime(int[] arr, int x) {
        int time = 0;
        for (int i : arr) {
            time += (int) Math.ceil((double) i / (double) x);
        }

        return time;
    }
}