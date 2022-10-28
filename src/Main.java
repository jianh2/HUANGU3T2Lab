import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        String message = "";
        Scanner myScanner = new Scanner(System.in);
        System.out.println( "Enter a positive integer: ");
        int num = myScanner.nextInt();
        if (num <= 0) {
            System.out.println("That's not a positive number ");



        }

        if (num % 2 == 0) {
            if (num > 1000) {
                System.out.println("Big number");
            }else if (num > 100) {
                System.out.println("medium number");
            }else{
                System.out.println("small number");
            }

            if (num % 5 == 0) {
                System.out.println(" divisible by 7");
            }else{
                System.out.println("not divisible by 7");
            }

            if (num % 7 == 0) {
                System.out.println("divisible by 7");
            }else{
               System.out.println("not divisible by 7");
            }



        }




        // write your code here to print the appropriate message(s)
        // described below

    }
}

