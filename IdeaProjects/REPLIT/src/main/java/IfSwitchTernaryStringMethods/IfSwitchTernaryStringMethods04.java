package IfSwitchTernaryStringMethods;

import java.util.Scanner;

public class IfSwitchTernaryStringMethods04 {

    /*

    Write a switch statement that tests the value of the char variable response and performs the following actions:

    if response is a, the message Your request is being processed is printed

    if response is b, the message Thank you anyway for your consideration is printed

    if response is c, the message Sorry, no help is currently available is printed for any other value of response,
    the message "Invalid entry, please try again!" is printed

    Create Scanner object.

    Use charAt() method, in order to get the char value at the specified index.

    Example:

    -Display prompt: "Enter command:"

    input: a
    -Display prompt:
    "Your request is being processed"


    */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter command");
        char ch = input.next().charAt(0);

        switch(ch){

            case 'a' :
                System.out.println("Your request is being processed is printed");
                break;
            case 'b' :
                System.out.println("Thank you anyway for your consideration is printed");
                break;
            case 'c' :
                System.out.println("Invalid entry, please try again!");
                break;
            default:
                System.out.println("Invalid command");

        }


    }



}
