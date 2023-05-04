package ForWhileLoops;

import java.util.*;

public class ForWhileLoops03 {

    /*

    Write a code that returns the duplicate chars in a String array.(interview Question)

    Input :

    String str=“Javaisalsoeasy”

    Output: [a, s]

    */

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string expression");

        String expression = input.nextLine().toLowerCase();

        String [] arr = expression.split("");
        //System.out.println(Arrays.toString(arr));
        Set<String> repetitives = new HashSet<>();


        for (int i = 0; i < arr.length ; i++) {


            if (expression.indexOf(arr[i])!= expression.lastIndexOf(arr[i])){

                repetitives.add(arr[i]);

            }


        }

        System.out.println(repetitives);











    }










}
