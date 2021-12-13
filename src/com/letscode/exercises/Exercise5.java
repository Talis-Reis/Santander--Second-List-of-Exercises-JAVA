package com.letscode.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args){

     String guestList[] = new String[5];
     String biggestName = "";

     Scanner valuesEntry = new Scanner(System.in);

     for(int i = 0; i < guestList.length; i++){
         guestList[i] = valuesEntry.next();

         if(biggestName.length() < guestList[i].length()){
             biggestName = guestList[i];
         }
     }
        System.out.println("Guest list: " + Arrays.toString(guestList));
        System.out.printf("Longest name is %s with %s characters.", biggestName, biggestName.length());

    }
}
