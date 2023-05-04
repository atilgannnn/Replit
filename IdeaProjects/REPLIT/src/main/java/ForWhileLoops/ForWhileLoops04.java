package ForWhileLoops;

import java.util.Scanner;

public class ForWhileLoops04 {

    /*

    Write a return method that accepts an integer as input and calculates factorial and prints like output.

    Input : 6

    Output: 6!=6*5*4*3*2*1=720

    */

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer value");
        int number = input.nextInt();
        int factorial = 1;

        for (int i = 1; i <= number ; i++) {

            factorial *= i;

        }

        System.out.println("Output : "+ number +"!"+" = "+ factorial);


    }




}
