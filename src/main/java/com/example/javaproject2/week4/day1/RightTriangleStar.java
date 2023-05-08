package com.example.javaproject2.week4.day1;

import java.util.Scanner;

public class RightTriangleStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        String res = "";

        for (int i = 0; i < height; i++) {
            res += "*";
            System.out.println(res);
        }
    }
}
