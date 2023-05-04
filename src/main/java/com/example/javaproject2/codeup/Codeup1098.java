package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1098 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hVal = sc.nextInt();
        int wVal = sc.nextInt();
        int num = sc.nextInt();
        int[][] res = new int[hVal][wVal];

        for (int i = 0; i < num; i++) {
            int len = sc.nextInt();
            int direct = sc.nextInt();
            int xVal = sc.nextInt() - 1;
            int yVal = sc.nextInt() - 1;

            if (direct == 0) {
                for (int j = yVal; j < yVal + len; j++)
                    res[xVal][j] = 1;
            } else if (direct == 1) {
                for (int j = xVal; j < xVal + len; j++)
                    res[j][yVal] = 1;
            }
        }

        for (int i = 0; i < hVal; i++) {
            for (int j = 0; j < wVal; j++)
                System.out.print(res[i][j] + " ");
            System.out.println();
        }
    }
}
