package IfSwitchTernaryStringMethods;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.sql.SQLOutput;
import java.util.Scanner;

public class IfSwitchTernaryStringMethods02 {


    public static void main(String[] args) throws UnsupportedEncodingException {


        /*

        * Ask user Name, Surname and credit card numbers than convert it to special form. (Initials for name and surname should be uppercase)


        (Check credit card number, if there aren’t 16 digit print “Invalid credit card number”

        Input :

        John White 1234234534561478

        Output :

        Name : J*** W****

        CCN  : **** **** **** 1478


        */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = input.next();
        System.out.println("Please enter your surname");
        String surname = input.next();
        System.out.println("Please enter your card number.Your card number must be 16 digits exactly");
        String cardNumber = input.next();

        if (cardNumber.length()!=16){

            System.out.println("Invalid credit card number");


        }else{

            String name1 = name.toUpperCase().substring(0, 1) + "" + name.substring(1, name.length()).replaceAll("[A-Za-z]", "*");
            String surname1 = surname.toUpperCase().substring(0, 1) + "" + surname.substring(1, surname.length()).replaceAll("[A-Za-z]", "*");
            String cardAsterix = "**** **** ****";
            String carNumber1 = cardNumber.substring(cardNumber.length() - 4);
            System.out.println(name1 + " " + surname1 + "\n" + cardAsterix + " " + carNumber1);

        }


    }


}
