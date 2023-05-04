package IfSwitchTernaryStringMethods;

import java.util.Scanner;

public class IfSwitchTernaryStringMethods05 {

    /*

    Write a Java program to find the number of days in a month.(Use Switch Case) (Interview Question / Leak Year)

    Sample:

    INPUT:

    Input a month number: 2

    Input a year: 2016

    OUTPUT  :

    February 2016 has 29 days


    */

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a month number between 1-12");
        int monthNo = input.nextInt();

        System.out.println("Please enter the year");
        int year = input.nextInt();

        if (year%100 == 0 && year%400 == 0 || year%100 != 0  && year%4 == 0){

            switch(monthNo){

                case 1 :
                    System.out.println(year + " January has 31 Days");
                    break;
                case 3 :
                    System.out.println(year + " March has 31 Days");
                    break;
                case 5 :
                    System.out.println(year + " May has 31 Days");
                    break;
                case 7 :
                    System.out.println(year + " July has 31 Days");
                    break;
                case 8 :
                    System.out.println(year + " August has 31 Days");
                    break;
                case 10 :
                    System.out.println(year + " October has 31 Days");
                    break;
                case 12 :
                    System.out.println(year + " December has 31 Days");
                    break;
                case 2 :
                    System.out.println(year + " February has 29 Days");
                    break;
                case 4 :
                    System.out.println(year + " April has 30 Days");
                    break;
                case 6 :
                    System.out.println(year + " June has 30 Days");
                    break;
                case 9 :
                    System.out.println(year + " September has 30 Days");
                    break;
                case 11 :
                    System.out.println(year + " November has 30 Days");
                    break;
                default:
                    System.out.println("Please enter a valid month number!");


            }



        }else{

            switch(monthNo){

                case 1 :
                    System.out.println(year + " January has 31 Days");
                    break;
                case 3 :
                    System.out.println(year + " March has 31 Days");
                    break;
                case 5 :
                    System.out.println(year + " May has 31 Days");
                    break;
                case 7 :
                    System.out.println(year + " July has 31 Days");
                    break;
                case 8 :
                    System.out.println(year + " August has 31 Days");
                    break;
                case 10 :
                    System.out.println(year + " October has 31 Days");
                    break;
                case 12 :
                    System.out.println(year + " December has 31 Days");
                    break;
                case 2 :
                    System.out.println(year + " February has 28 Days");
                    break;
                case 4 :
                    System.out.println(year + " April has 30 Days");
                    break;
                case 6 :
                    System.out.println(year + " June has 30 Days");
                    break;
                case 9 :
                    System.out.println(year + " September has 30 Days");
                    break;
                case 11 :
                    System.out.println(year + " November has 30 Days");
                    break;
                default:
                    System.out.println("Please enter a valid month number!");


            }




        }



    }



}
