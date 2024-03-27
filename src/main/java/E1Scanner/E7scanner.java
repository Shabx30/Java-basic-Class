package E1Scanner;

import java.util.Scanner;

public class E7scanner {
    public static void main(String[] args) {
        Scanner scanner1= new Scanner(System.in);
        Scanner scanner2= new Scanner (System.in);
        System.out.println("please enter your age");
        int age = scanner1.nextInt();
        System.out.println("please enter your full name");
        String fullName = scanner2.nextLine();
        System.out.println("My Full Name and age is " +fullName+" "  +age);


    }
}