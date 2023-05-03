package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[] arr = new int[23];

        for (int i = 0; i < cnt; i++) {
            arr[sc.nextInt() - 1]++;
        }

        for (int i = 0; i < 23; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
