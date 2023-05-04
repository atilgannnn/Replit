package IfSwitchTernaryStringMethods;

import java.util.Scanner;

public class IfSwitchTernaryStringMethods06 {

    /*

    Ask user to type a name,

    the length of name should be 3.

    Then check if the name has same characters.

    If the String has same characters

    Print “String has duplicate characters”
    Else

    Print “String has unique characters”

    Please use ternary.


    Input :

    ala

    OutPut:

    String has duplicate characters

    */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a name comprise of three letters");
        String word = input.nextLine();

        String result =  word.length()>3 ? "The length of name should be 3 " : (word.charAt(0) == word.charAt(1) || word.charAt(0) == word.charAt(2) || word.charAt(1) == word.charAt(2))?
                        "String has duplicate characters":
                        "String has unique characters";

        System.out.println(result);


    }





}
