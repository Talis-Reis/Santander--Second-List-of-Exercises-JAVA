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
        String nameOfUnderagePerson = "";
        int youngerAge = 0;
        int sum = 0;
        float average = 0;


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

        nameOfPersonOfLegalAge = people[0].name;
        youngerAge = people[0].age;

        for(int j = 0; j < people.length; j++){

            if(ageOfPersonOfLegalAge < people[j].age){
                nameOfPersonOfLegalAge = people[j].name;
                ageOfPersonOfLegalAge = people[j].age;
            }

            if(people[j].age < youngerAge){
                nameOfUnderagePerson = people[j].name;
                youngerAge = people[j].age;
            }

            sum += people[j].age;

            average = sum / 5;

        }
        System.out.println("************************************");
        System.out.printf("Older person: Name %s. Idade: %s.",nameOfPersonOfLegalAge, ageOfPersonOfLegalAge);
        System.out.println("");
        System.out.printf("Younger person: Name %s. Idade: %s.",nameOfUnderagePerson, youngerAge);
        System.out.println("");
        System.out.println("Average age: " + average);
        System.out.println("************************************");
    }
}
