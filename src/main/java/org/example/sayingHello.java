package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Exercise 1 Solution
 *  Copyright 2021 Drake Scott
 */

public class sayingHello {
    public static void main(String[] args){
        System.out.print("What is your name? ");

        Scanner input = new Scanner(System.in);
        String name = input.next();
        String output = "Hello, " + name + ", nice to meet you!";
        System.out.println(output);
    }
}
