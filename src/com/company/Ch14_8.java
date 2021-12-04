package com.company;

import java.util.Scanner;

public class Ch14_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a phone number in the form (555) 555-5555: ");
        String number = input.nextLine();
        input.close();

        String[] tokens = number.split("[()\\s\\-]");

        for (int i = 0; i < tokens.length; i++)
            System.out.print(tokens[i]);
    }
}