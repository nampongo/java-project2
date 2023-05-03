package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1088 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(), sum = 0;

        for (int i = 1; sum < num; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
