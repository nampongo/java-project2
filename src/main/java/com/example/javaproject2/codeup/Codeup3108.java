package com.example.javaproject2.codeup;


import java.util.ArrayList;
import java.util.List;

class Student {
    private String code;
    private String testId;
    private String name;

    public Student(String code, String testId, String name) {
        this.code = code;
        this.testId = testId;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getTestId() {
        return testId;
    }

    public String getName() {
        return name;
    }
}

public class Codeup3108 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student student = new Student("I", "999", "백두산");
    }
}
