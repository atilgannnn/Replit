package ForWhileLoops;

public class ForWhileLoops05 {

    /*

    Print even numbers from 20 to 0 but do not use decrement (i--).

    OUTPUT  : Even Numbers from 20 to 0 are: 20 18 16 14 12 10 8 6 4 2 0

    */

    public static void main(String[] args) {

        int a = 20;
        for (int i = 0; i <= a ; i++) {

            if (i%2==0) {
                System.out.print(a-i + " ");
            }
        }

    }



}
