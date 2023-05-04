package ForWhileLoops;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ForWhileLoops01 {

    /*

        Ask user to enter a name and a character, then check how many times the character is repeated in the name using loops in the name

        e.g:

        char ch1= 'a' ;

        String name =“John came late"

        Expected Output: Number of a = 2



    */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a String expression");
        String expression = input.nextLine().toLowerCase();
        System.out.println("Please enter a character - The character must be a letter!");
        char ch = input.next().toLowerCase().charAt(0);
        int counter = 0;
        for (int i = 0; i < expression.length(); i++) {

            if (expression.charAt(i)== ch) {

                counter++;

            }


        }

        System.out.println("Number of " + ch + " = " + counter);



    }




}
