package com.example.javaproject2.week1.day5;

public class UserTest {
    public static void main(String[] args) {
        User user1 = new User();
        user1.name = "김경록";
        user1.age = 35;
        user1.phoneNumber = "010-0000-0000";

        User user2 = new User();
        user2.name = "김OO";
        user2.age = 25;
        user2.phoneNumber = "010-1111-1111";

        System.out.printf("%s님은 성인입니까? %s\n", user1.name, user1.isAdult());
        System.out.printf("%s님은 성인입니까? %s\n", user2.name, user2.isAdult());
    }
}
