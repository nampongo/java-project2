package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1014 {
    public static void main(String[] args) {
        char c1, c2;
        Scanner sc = new Scanner(System.in);
        c1 = sc.next().charAt(0);
        c2 = sc.next().charAt(0);

        System.out.printf("%c %c\n", c2, c1);
    }
}
