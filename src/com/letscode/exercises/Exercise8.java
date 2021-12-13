package com.letscode.exercises;

import java.util.Scanner;

class people{
    String name;
    float height;
    float weight;
}

public class Exercise8 {

    public static void main(String[] args){

        people person[] = new people[5];

        Scanner  imcInformation = new Scanner(System.in);

        for(int i = 0; i < person.length; i++){

            person[i] = new people();

            System.out.println("Enter with the name: ");
            String namePeopleImc = imcInformation.next();

            System.out.println("Enter the height: ");
            float heightPeopleImc = imcInformation.nextFloat();

            System.out.println("Enter the weight: ");
            float weightPeopleImc = imcInformation.nextFloat();

            person[i].name = namePeopleImc;
            person[i].height = heightPeopleImc;
            person[i].weight = weightPeopleImc;

        }

        for(int j = 0; j < person.length; j++){
            Exercise8 calculation = new Exercise8();
            if(calculation.calculationImc(person[j].weight, person[j].height) < 18.5 || calculation.calculationImc(person[j].weight, person[j].height) > 25){
                System.out.printf("FORA DO PESO IDEAL --- Name: %s. Height: %s. Weight: %s. IMC: %.2f.",person[j].name, person[j].height, person[j].weight, calculation.calculationImc(person[j].weight, person[j].height));
                System.out.println("");
            }

        }
    }

    public float calculationImc (float weight, float height){
        float calculation;
        calculation = weight / (height * height);
        return calculation;
    }


}


