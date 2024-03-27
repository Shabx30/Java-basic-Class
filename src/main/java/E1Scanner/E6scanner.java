package E1Scanner;

import java.util.Scanner;

public class E6scanner {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("please enter your age");
        int age = scanner.nextInt();
        System.out.println("please enter your name");
        scanner.nextLine();// THIS IS MY EXTRA CALL TO FOR ME TO ABLE TO TYPE MY NAME INTO THE SYSTEM
        String name = scanner.nextLine();
        System.out.println("My name is "+ name+ " my age is " +age + " years old");


    }
}
