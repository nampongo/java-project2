package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] res = str.split("\\.");

        System.out.printf("%04d.%02d.%02d\n"
                , Integer.parseInt(res[0]), Integer.parseInt(res[1]), Integer.parseInt(res[2]));
    }
}
