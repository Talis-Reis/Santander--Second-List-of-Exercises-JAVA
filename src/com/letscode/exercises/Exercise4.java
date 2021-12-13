package com.letscode.exercises;

import java.util.Scanner;
import java.util.Arrays;

public class Exercise4 {

    public static void main(String[] args) {

        int calculateTheAverage = 0, larger = 0, smaller = 0, sum = 0;
        int arrayNumbers[]= new int [5];

        Scanner valuesEntry= new Scanner(System.in);

        for(int i = 0;i < arrayNumbers.length; i++){
            System.out.print("Enter five numbers : ");
            arrayNumbers[i]=valuesEntry.nextInt();
        }
        Arrays.sort(arrayNumbers);

        for(int i = 0;i < arrayNumbers.length; i++){

            {
                if(arrayNumbers[i]>=larger){
                    larger= arrayNumbers[i];
                }

                if(arrayNumbers[i]<=arrayNumbers[0]){
                    smaller=arrayNumbers[i];
                }
                sum += arrayNumbers[i];
                calculateTheAverage = sum / 5;
            }
        }
        System.out.println("Smallest number entered : "+ smaller);
        System.out.println("Highest number entered : "+larger);
        System.out.println("The average is é : "+ calculateTheAverage);

    }
}
