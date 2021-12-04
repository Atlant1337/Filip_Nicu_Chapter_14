package com.company;

import java.util.Scanner;
public class Ch14_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a line of text: ");
        String textLine = input.nextLine();
        input.close();

        System.out.printf("%s%n%s", textLine.toUpperCase(), textLine.toLowerCase());
    }
}