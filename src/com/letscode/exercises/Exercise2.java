package com.letscode.exercises;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args){

        Scanner entryWord = new Scanner(System.in);
        System.out.println("Enter the desired word:");
        String word = entryWord.next();

        char[] charactersWord = word.toCharArray();

        String contraryWord =  "";
        for (int i = charactersWord.length - 1; i >= 0; i--) {
            contraryWord += charactersWord[i];
        }
        System.out.println(contraryWord);
    }
}
