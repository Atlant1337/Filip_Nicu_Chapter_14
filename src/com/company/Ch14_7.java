package com.company;

import java.util.Scanner;

public class Ch14_7 {
    public static void main(String[] args) {


        System.out.println("Enter a sentence and press Enter");
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String[] tokens = sentence.split(" ");
        System.out.println("Number of elements is "+ tokens.length);

        for(int i = 0; i< tokens.length; i++){
            System.out.print(printLatinWord(tokens[i])+" ");
        }
    }

    public static String printLatinWord(String token){

        char firstChar = token.charAt(0);
        String newWord = " ";

        for(int i=1; i<token.length(); i++){
            newWord += token.charAt(i);
        }

        newWord += firstChar + "ay ";

        return newWord;
    }
}