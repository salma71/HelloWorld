package com.company.java;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String input = InputHelper.getInput("Enter value 1: ");
        System.out.println("you entered this value: ");
        input = InputHelper.getInput("enter value 2: ");
        System.out.println("you entered: " + input);
    }
}
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
//        String s1 = "Hello";
//        String s2 = "Hello";
//        if (s1 == s2) {
//            System.out.println("They match");
//        } else {
//            System.out.println("They don't match");
//        }
//        String s3 = new String("hello");
//        String s4 = new String("HELLO");
//        if (s3 == s4) {
//            System.out.println("they match");
//        } else {
//            System.out.println("they don't match");
//        }
//        if (s3.equals(s4)) {
//            System.out.println("they match");
//        } else {
//            System.out.println("they don't match");
//        }
//        if (s3.equalsIgnoreCase(s4)) {
//            System.out.println("they match");
//        } else {
//            System.out.println("they don't match");
//        }
//        double doubleValue = 1_234_567.89;
//        NumberFormat numberFormat = NumberFormat.getNumberInstance();
//        System.out.println(numberFormat.format(doubleValue));
//
//        NumberFormat intFormat = NumberFormat.getIntegerInstance();
//        System.out.println(intFormat.format(doubleValue)); // the fraction values are gone
//
//        numberFormat.setGroupingUsed(false);
//        System.out.println(numberFormat.format(doubleValue)); // git rid of the commas seperators
//
//        Locale locale = new Locale("de", "DE");
//        NumberFormat localFormat = NumberFormat.getNumberInstance(locale);
//        System.out.println(localFormat.format(doubleValue)); // will reverse the commas depending on the country
//
//        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);
//        System.out.println(currencyFormat.format(doubleValue)); // will show the currency with the number depends on the country
//
//        DecimalFormat df = new DecimalFormat("$##0.00#");
//        System.out.println(df.format(1));
//        System.out.println(df.format(5.591)); // this will show the number without zeros
//        StringBuilder c = new StringBuilder();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a numeric value: ");
//        String input1 = sc.nextLine();
//        double d1 = Double.parseDouble(input1);
//
//        System.out.print("Enter a numeric value: ");
//        String input2 = sc.nextLine();
//        double d2 = Double.parseDouble(input2);
//
//        double result = d1 + d2;
//
//        System.out.println("The answer is " + result);
//        try {
//            String welcome = "Welcome!";
//            char[] chars = welcome.toCharArray();
//            char lastChar = chars[chars.length - 1];
//            System.out.println("last char is: " + lastChar);
//
//            String nothing = null;
//            System.out.println(nothing);
//
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Array Exception error");
//            e.printStackTrace();
//
//            return; // to stop the program here
//        } catch (NullPointerException e){
//            System.out.println("Null exception error");
//            e.printStackTrace();
//
//        } catch (Exception e) {
//            System.out.println("Any exception");
//
//        }
//
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        try {
//            doSomeThing();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("code can run successfully");
//
//    }
//
//    public static void doSomeThing() throws InterruptedException {
//        Thread.sleep(1000);
//    }
//}
