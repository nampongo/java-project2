package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1091 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long start = sc.nextInt();
        //int multi = sc.nextInt();
        int add = sc.nextInt();
        int idx = sc.nextInt();

        for (int i = 0; i < idx - 1; i++) {
            start += add;
        }
        System.out.println(start);
    }
}
