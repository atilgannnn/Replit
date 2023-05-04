package MethodArray;

public class MethodArray02 {

    /*

    Write a Java program that reverse a sentence by using Array (with all spaces and special characters).

        Input  : Coding is greate.

        Output : .etaerg si gnidoC

    */

    public static void main(String[] args) {

        String r = reverseSentence("Coding is greate.");
        System.out.println(r);


    }





    public static String reverseSentence(String s) {

        char[] letters = new char[s.length()];
        int letterIndex = 0;
        for (int i = s.length() - 1; i > -1; i--) {

            letters[letterIndex] = s.charAt(i);
            letterIndex++;

        }

        String reverse = "";
        for (int j = 0; j < s.length(); j++) {

            reverse += letters[j];

        }

        return reverse;


    }








}
