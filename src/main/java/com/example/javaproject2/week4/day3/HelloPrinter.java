package com.example.javaproject2.week4.day3;

public class HelloPrinter {
    // 파일에도 저장하고 싶고
    // 콘솔에도 출력하고 싶다
    Printer2 printer = new ConsolePrinter();

    public void repeatMessage(int n, String message) {
        for (int i = 0; i < n; i++) {
            printer.print(message);
        }
    }

    public static void main(String[] args) {
        HelloPrinter hp = new HelloPrinter();
        hp.repeatMessage(5, "Hello");
    }
}
