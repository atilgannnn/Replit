package ForWhileLoops;

import java.util.Scanner;

public class ForWhileLoops02 {

    /*

        Ask user to enter 2 integer then find GCD (Greatest Common Divisor) and LCM (Least Common Multiple)

        Input :

        30 and 40

        Expected OutPut:

        GCD for 30 and 40 = 10

        LCM for 30 and 40 = 120


    */

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first integer : ");
        int first = input.nextInt();
        System.out.println("Please enter the second integer : ");
        int second = input.nextInt();

        int greatest = Math.max(first,second);
        int  least = Math.min(first,second);
        int gcd = 0;
        int lcm = 0;
        int multiply = first*second;

        for (int i = 1; i <= least ; i++) {

            if (first % i == 0 && second % i == 0) {

                gcd = i;


            }

        }

        for (int j = multiply; j >= greatest ; j--) {

            if (j%first==0 && j%second==0){

                lcm = j;


            }


            }

        System.out.println("GCD (Greatest Common Divisor) for "+first+" and "+second+" is "+gcd);
        System.out.println("LCM (Least Common Multiple) for "+first+" and "+second+" is "+lcm);


            



    }
}
