package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sVal = sc.nextLine();
        String[] res = sVal.split("-");

        System.out.println(res[0] + res[1]);
    }
}