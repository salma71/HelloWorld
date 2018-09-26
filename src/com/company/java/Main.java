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
        StringBuilder b = new StringBuilder();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value 1: ");
        String input1 = scanner.nextLine();

        System.out.print("Enter value 2: ");
        String input2 = scanner.nextLine();

        b.append(input1)
                .append(", ")
                .append(input2);

        System.out.println(b.toString());
    }
}
