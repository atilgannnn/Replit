package Deneme;

public class D01 {
    public static void main(String[] args) {
/*
        for (int i = 1; i <= 12; i=i+2) {
            for (int j = 1; j <= 2*i-(i+1); j++) {
                System.out.print("*");
            }
            System.out.println();
            }

 */
        for (int i = 0; i < 6; i++) {
            System.out.print("*");

            for (int j = 0; j <= 2*(i-1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        String tek = "*";
        String cift = "**";

        for (int i = 1; i <= 6; i++) {

            if (i==1){
                System.out.println(tek);
            } else if (i>1){
                System.out.println(cift.repeat(i-1));
            }
            {

            }

        }

        int a = 1;
        while (a < 12){
            System.out.println("*".repeat(a));
            if (a ==1){
                a+=1;
            }
            a += 2;
        }








    }




}
