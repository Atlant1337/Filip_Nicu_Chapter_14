package com.company;

import java.util.Scanner;
public class Ch14_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("type a phrase: ");
        String sentence = input.nextLine();
        input.close();

        String[] tokens = sentence.split(" ");
        for (int i = tokens.length - 1; i >= 0; i--)
            System.out.print(tokens[i] + " ");
    }
}