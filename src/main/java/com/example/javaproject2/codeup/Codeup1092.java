package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1092 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int cnt = 2;

        while(cnt % num1 != 0 || cnt % num2 != 0 || cnt % num3 != 0) {
            cnt++;
        }
        System.out.println(cnt);
    }
}
