package ForWhileLoops;

public class ForWhileLoops07 {


    /*

        Write java code checking the number is Perfect number or not.

        * Any number can be a Java Perfect Number if the sum of its positive divisors excluding the number itself is equal to that number.

        Input :6
        Output:6 is Perfect Number
        Input :7
        Output:7 is not Perfect Number

    */

    public static void main(String[] args) {

        int sayi = 6;
        int kalan = 0;

        for (int i = 1; i < sayi ; i++) {

            if (sayi%i==0){

                kalan += i;

            }


        }

        if (kalan==sayi){

            System.out.println(sayi + " is Perfect Number");

        }else {


            System.out.println(sayi + " is not Perfect Number");
        }






    }



}
