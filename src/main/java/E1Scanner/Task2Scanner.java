package E1Scanner;

import javax.swing.*;
import java.util.Scanner;

// you are DMV rep and you need tp ask customer their age. if they are 18 or older you will issue a driver license to them, otherwise you will offer them to get a learners perm
public class Task2Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How old are you ?");
        int age = scanner.nextInt();
        if (age >= 18)
        {
            System.out.println("drivers license"); }
        else{
            System.out.println("Learner Permit");}

        }
    }