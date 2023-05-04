package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1099 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] maze = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                int num = sc.nextInt();
                if(num == 1 || num == 2)
                    maze[i][j] = num;
            }
        }

        int x = 1, y = 1;
        if(maze[x][y] == 2) {
            maze[x][y] = 9;
        } else {
            maze[x][y] = 9;
            while(true) {
                if (maze[x][y + 1] == 0 || maze[x][y + 1] == 2) {
                    y++;
                    if(maze[x][y] == 2) {
                        maze[x][y] = 9;
                        break;
                    }
                    maze[x][y] = 9;
                } else if(maze[x + 1][y] == 0 || maze[x + 1][y] == 2) {
                    x++;
                    if(maze[x][y] == 2) {
                        maze[x][y] = 9;
                        break;
                    }
                    maze[x][y] = 9;
                } else break;
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }
    }
}
