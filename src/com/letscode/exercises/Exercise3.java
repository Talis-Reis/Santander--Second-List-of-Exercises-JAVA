package com.letscode.exercises;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args){

        int [] arrayNumbers = new int[5];
        List<Integer> arrayNumbersPares = new ArrayList<>();
        List<Integer> arrayNumbersImpares = new ArrayList<>();
        Scanner entryValues = new Scanner(System.in);

        for(int i = 0; i < arrayNumbers.length; i++){
            System.out.println("Enter the desired number: ");
            arrayNumbers[i] = entryValues.nextInt();
        }

        for(int i = 0; i < arrayNumbers.length; i++){
            if(arrayNumbers[i] % 2 == 0){
                arrayNumbersPares.add(arrayNumbers[i]);
            }else
            {
                arrayNumbersImpares.add(arrayNumbers[i]);
            }
        }

        System.out.println(arrayNumbersImpares);
        System.out.println(arrayNumbersPares);
    }
}
