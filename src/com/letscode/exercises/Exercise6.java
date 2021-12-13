package com.letscode.exercises;

import java.util.Scanner;

public class Exercise6 {

    public static void main(String[] args){

        Scanner entryChosenWord = new Scanner(System.in);
        System.out.println("Enter the chosen word");
        String chosenWord = entryChosenWord.next();
        char[] charactersChosenWord = chosenWord.toCharArray();

        for(int i = 0; i < charactersChosenWord.length; i++){
            if(i % 2 == 0){
                charactersChosenWord[i] = Character.toUpperCase(charactersChosenWord[i]);
            }
        }
        System.out.println(charactersChosenWord);
    }
}
