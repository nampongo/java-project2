package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1671 {
    public static String play(int user, int computer) {
        int res = user - computer;

        if(res == -1 || res == 2)
            return "win";
        else if(res == -2 || res == 1)
            return "lose";
        else if(res == 0)
            return "tie";

        return "";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int user = sc.nextInt();
        int com = sc.nextInt();

        System.out.println(play(user, com));
    }
}
