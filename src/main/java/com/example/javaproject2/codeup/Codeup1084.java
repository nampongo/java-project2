package com.example.javaproject2.codeup;

import java.io.*;

public class Codeup1084 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] hbcs = str.split(" ");
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        double res = Long.valueOf(hbcs[0]) * Long.valueOf(hbcs[1]) * Long.valueOf(hbcs[2]) / 8.0;

        pw.printf("%.2f MB\n", res / 1024.0 / 1024.0);
        pw.flush();
    }
}
