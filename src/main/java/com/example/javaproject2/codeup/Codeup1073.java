package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1073 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            char val = sc.next().charAt(0);
            System.out.println(val);
            if(val == 'q') break;
        }
    }
}
