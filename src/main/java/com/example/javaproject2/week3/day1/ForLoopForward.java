package com.example.javaproject2.week3.day1;

import java.util.Scanner;

public class ForLoopForward {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int num = sc.nextInt(); num != 0;) {
            System.out.println(num);
            num = sc.nextInt();
        }
    }
}
