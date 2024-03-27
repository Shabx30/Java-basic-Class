package E1Scanner;

import java.util.Scanner;

public class Task4Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you have a credit card");
        String haveCreditcard = scanner.next();
        if (haveCreditcard.equalsIgnoreCase("yes")) {
            System.out.println("what is the balance of the card");
            double balance = scanner.nextDouble();
            if (balance > 1000) {
                System.out.println("pay off immediatetely");
            } else {
                System.out.println("You can spend more");}
            }else{
                System.out.println("we can offer you the credit card");
            }
        }
    }




