package com.example.javaproject2.week1.day4;

import java.util.Scanner;

public class ScannerEx2Test {
    public static void main(String[] args) {
        ScannerEx2 scannerEx2 = new ScannerEx2();
        scannerEx2.inputTwoNumbersAndPlus();
    }

    public static class ScannerEx2 {
        public void inputTwoNumbersAndPlus() {
            Scanner sc = new Scanner(System.in);
            System.out.println(sc.nextInt() + sc.nextInt());
        }
    }
}