package com.example.javaproject2.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderTwoNumbers {
    public void plusTwoNums() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr); // 카트 가지고 오기
        System.out.println(br.readLine() + br.readLine());

    }
}
