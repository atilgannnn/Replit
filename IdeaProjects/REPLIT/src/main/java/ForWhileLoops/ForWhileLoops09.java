package ForWhileLoops;

public class ForWhileLoops09 {

    /*

    Write a java program to reverse the number which user entered.

    Input  :1238
    Output :Reverse Of The Number: 8321

    */


    public static void main(String[] args) {


        int number = 1238;
        int newNumber = 0;

        do {

            newNumber *= 10;
            newNumber += number%10;
            number /= 10;




        }while (number != 0);

        System.out.println("Reverse Of The Number: " + newNumber);











    }




}
