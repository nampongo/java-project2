package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1028 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] nums = input.split("\\.");

        System.out.printf("%s\n%s", nums[0], nums[1]);
    }
}
