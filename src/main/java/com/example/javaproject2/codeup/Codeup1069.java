package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1069 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = sc.nextInt();

        if(ans <= 100 && ans >=90) {
            System.out.println("A");
        } else if(ans >= 70) {
            System.out.println("B");
        } else if(ans >= 40) {
            System.out.println("C");
        } else if(ans >= 0) {
            System.out.println("D");
        }
    }
}
