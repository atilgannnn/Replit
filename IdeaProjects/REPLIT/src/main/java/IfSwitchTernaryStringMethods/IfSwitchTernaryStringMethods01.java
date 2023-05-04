package IfSwitchTernaryStringMethods;

import java.util.Scanner;

public class IfSwitchTernaryStringMethods01 {

    public static void main(String[] args) {

        /*

        Ask user to their weight and height and type a program with calculates mass index

        "* HINT : Body Mass Index = Weight (kg) / Square of height (m)

        Then give a message to user as following:

        If BMI is less than 18.5 , you re weak
        If BMI is between 18.5 and 25 , your weight is ideal
        If BMI is between 25 and 30, you re fat
        If BMI is more than or equal to 30, obese

        EXAMPLE :

        INPUT:

        Weight : 71

        Height : 1,72

        OUTPUT :

        Your BMI is  : 23.99945916711736
        Your weight is ideal"


        */


                Scanner input = new Scanner(System.in);
                System.out.println("Please enter your weight");
                double weight = input.nextDouble();
                System.out.println("Please enter your height");
                double height = input.nextDouble();

                double bodyMassIdx = weight/(height*height);
                if (bodyMassIdx<18.5 && bodyMassIdx>0) {

                    System.out.println("You are weak!");

                }else if(bodyMassIdx>18 && bodyMassIdx<25){

                    System.out.println("Your weight is ideal!");

                }else if(bodyMassIdx>=25 && bodyMassIdx<30){

                    System.out.println("You are fat!");

                }else if (bodyMassIdx>=30) {

                    System.out.println("Obese");

                }else{

                    System.out.println("Invalid Value");

                }




            }

















}
