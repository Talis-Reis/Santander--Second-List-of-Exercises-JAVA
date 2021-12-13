package com.letscode.exercises;

import java.util.Scanner;

class person{
    String name;
    int age;
}

public class Exercise7 {

    public static void main(String[] args){

        person people[] = new person[5];
        String nameOfPersonOfLegalAge = "";
        int ageOfPersonOfLegalAge = 0;

        Scanner valuesEntry = new Scanner(System.in);

        for(int i = 0; i < people.length; i++) {

            people[i] = new person();

            System.out.println("Enter with the name: ");
            String namePeople = valuesEntry.next();

            System.out.println("Enter with the age: ");
            int agePeople = valuesEntry.nextInt();

            people[i].name = namePeople;
            people[i].age = agePeople;
        }

        for(int j = 0; j < people.length; j++){

            if(ageOfPersonOfLegalAge < people[j].age){
                nameOfPersonOfLegalAge = people[j].name;
                ageOfPersonOfLegalAge = people[j].age;
            }
        }
        System.out.println("************************************");
        System.out.println("MAIOR DE IDADE:");
        System.out.printf("NAME: %s. IDADE: %s.",nameOfPersonOfLegalAge, ageOfPersonOfLegalAge);
    }
}
