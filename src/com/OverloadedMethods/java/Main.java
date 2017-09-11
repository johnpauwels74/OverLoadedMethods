package com.OverloadedMethods.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Using overloaded method to work with customer data
        String input;
        String businessNameString;
        String nameString;
        String phoneString;

        Scanner sc = new Scanner(System.in);
        int NumberEntered;
        boolean end = false;

        while (end == false) {
            System.out.println("Please enter the number of your selection:");
            System.out.println("1. Business Customer");
            System.out.println("2. Residential Customer");
            System.out.println("3. Exit");
            input = sc.nextLine();
            NumberEntered = Integer.parseInt(input);

            switch (NumberEntered) {
                case 1:
                    System.out.println("Please enter your business name: ");
                    input = sc.nextLine();
                    businessNameString = input;
                    System.out.println("Please enter your name: ");
                    input = sc.nextLine();
                    nameString = input;
                    System.out.println("Please enter your phone number: ");
                    input = sc.nextLine();
                    phoneString = input;
                    CustomerMethod(businessNameString, nameString, phoneString);
                    end = true;
                    break;
                case 2:
                    System.out.println("Please enter your name: ");
                    input = sc.nextLine();
                    nameString = input;
                    System.out.println("Please enter your phone number: ");
                    input = sc.nextLine();
                    phoneString = input;
                    CustomerMethod(nameString, phoneString);
                    end = true;
                    break;
                case 3:
                    System.out.println("Exiting...");
                    end = true;
                    break;
                default:
                    System.out.println("Invalid entry. Please enter a number between 1 and 3.");
            }
        }
    }

    static String CustomerMethod(
            String businessName,
            String name,
            String phone){
        System.out.println(businessName);
        System.out.println(name);
        System.out.println(phone);
        return "";
    }

    static String CustomerMethod(
            String name,
            String phone){
        System.out.println(name);
        System.out.println(phone);
        return "";
    }
}
