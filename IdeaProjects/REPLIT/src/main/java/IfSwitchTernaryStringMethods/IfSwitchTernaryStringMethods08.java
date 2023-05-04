package IfSwitchTernaryStringMethods;

import java.util.Scanner;

public class IfSwitchTernaryStringMethods08 {

    /*

     Ask user for a string and print a new string made of 3 copies of the last 2 letters

     The strings length will be at least 2.

     Sample:

     INPUT       : Mustafa
     OUTPUT      : fafafa

    */


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a one word string expression");
        String word = input.next();

        String newWord = word.substring(word.length()-2);

        int i = 1;
        while(i<4){

            System.out.print(newWord);
            i++;


        }



    }




}
