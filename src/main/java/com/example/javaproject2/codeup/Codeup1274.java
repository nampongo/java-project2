package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1274 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean flg = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                flg = false;
                break;
            }
        }
        if(flg) System.out.println("prime");
        else System.out.println("not prime");
    }
}
