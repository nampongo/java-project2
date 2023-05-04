package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1097 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] baduk = new int[19][19];
        int cnt = sc.nextInt();

        for (int i = 0; i < cnt; i++) {
            int y = sc.nextInt() - 1, x = sc.nextInt() - 1;

            for (int j = 0; j < 19; j++) {
                if (baduk[y][j] == 1) baduk[y][j] = 0;
                else baduk[y][j] = 1;
            }
            for (int j = 0; j < 19; j++) {
                if (baduk[j][x] == 1) baduk[j][x] = 0;
                else baduk[j][x] = 1;
            }
        }

        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++)
                System.out.print(baduk[i][j] + " ");
            System.out.println();
        }
    }
}
