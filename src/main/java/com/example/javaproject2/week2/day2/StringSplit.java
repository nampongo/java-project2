package com.example.javaproject2.week2.day2;

public class StringSplit {
    public static void main(String[] args) {
        String str = "10 3 19 28 7 488";
        String[] strArr = str.split(" ");

        // strArr 배역에서 인데스로 접근하여 값을 출력
        System.out.println(strArr[0]);
        System.out.println(strArr[1]);
        System.out.println(strArr[2]);
        System.out.println(strArr[3]);
        System.out.println(strArr[4]);
        System.out.println(strArr[5]);
    }
}
