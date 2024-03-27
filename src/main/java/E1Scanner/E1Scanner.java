//scanner is a non primitive data type every class is a non primitive data type with the first letter is upper casei
// =the assignment operator


package E1Scanner;

import java.util.Scanner;

public class E1Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter your age");
        int age = scan.nextInt();
        if (age >=18) {
            System.out.println("you can vote");
        } else {
            System.out.println("You need to wait");}
        }
    }
