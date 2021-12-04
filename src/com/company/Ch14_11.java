package com.company;

import java.util.Scanner;
public class Ch14_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("text line: ");
        String string = input.nextLine();

        System.out.print("searched character: ");
        char key = input.next().charAt(0);
        input.close();

        int counter = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.indexOf(key, i) == -1)
                break;
            else {
                counter++;
                i = string.indexOf(key, i);
            }
        }

        System.out.printf("\'%s\' aparece %d vez(es) no texto", key, counter);
    }
}