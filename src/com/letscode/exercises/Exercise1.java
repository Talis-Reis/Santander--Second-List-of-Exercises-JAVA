package com.letscode.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args){

        String [] arrayFruits = new String[5];
        Scanner entryValues = new Scanner(System.in);

        for(int i = 0; i < arrayFruits.length; i++){
            System.out.println("Insert a fruit to add to cart");
            arrayFruits[i] = entryValues.next();
        }
        System.out.println(Arrays.toString(arrayFruits));
    }
}
