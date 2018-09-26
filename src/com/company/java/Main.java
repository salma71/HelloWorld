package com.company.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        StringBuilder sb = new StringBuilder("Wlcomre");
//        sb.append("to salma");
//        sb.toString();
//        String result = sb.toString();
//        System.out.println(result);
//        StringBuilder b = new StringBuilder();
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter value 1: ");
//        String input1 = scanner.nextLine();
//
//        System.out.print("Enter value 2: ");
//        String input2 = scanner.nextLine();
//
//        b.append(input1)
//                .append(", ")
//                .append(input2);
//
//        System.out.println(b.toString());
        String s1 = "Hello";
        String s2 = "Hello";
        if (s1 == s2) {
            System.out.println("They match");
        } else {
            System.out.println("They don't match");
        }
        String s3 = new String("hello");
        String s4 = new String("HELLO");
        if (s3 == s4) {
            System.out.println("they match");
        } else {
            System.out.println("they don't match");
        }
        if (s3.equals(s4)) {
            System.out.println("they match");
        } else {
            System.out.println("they don't match");
        }
        if (s3.equalsIgnoreCase(s4)) {
            System.out.println("they match");
        } else {
            System.out.println("they don't match");
        }
    }
}
