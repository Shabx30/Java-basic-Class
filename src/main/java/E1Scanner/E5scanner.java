package E1Scanner;

import java.util.Scanner;

public class E5scanner {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("please enter gender m/f");
        char gender = scanner.next().charAt(0);
        System.out.println(gender);
    }
}
