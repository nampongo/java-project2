package com.example.javaproject2.week2.day3;

public class ReferenceTypeArray {
    public static void main(String[] args) {
        Student[] students = new Student[2];
        students[0] = new Student();
        students[0].name = "김경록";
        students[0].phoneNumber = "010-0000-0000";
        students[0].age = 37;

        students[1] = new Student();
        students[1].name = "김지유";
        students[1].phoneNumber = "010-1111-1111";
        students[1].age = 2;
    }
}
