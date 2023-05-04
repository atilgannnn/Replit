package MethodArray;

public class MethodArray01 {


    /*

    Write a return method to reverse number.

    Input  : 12345

    Output : 54321

    */


    public static void main(String[] args) {

        reverseNumber();







    }


    public static void reverseNumber(){

        int number = 12345;
        int newNumber = 0;

        do {

            newNumber *= 10;
            newNumber += number%10;
            number /= 10;




        }while (number != 0);

        System.out.println(newNumber);



    }






}
