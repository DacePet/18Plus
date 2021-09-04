package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // you can watch this content, if you are 18+

        Scanner input = new Scanner(System.in);
        System.out.println("You can watch this web content, if you are 18+. Enter your age.");
        double age = input.nextDouble();
        if (age >= 18)
            System.out.println("Welcome");
        else {
            System.out.println("Sorry, ask your parents");
        }
    }
}