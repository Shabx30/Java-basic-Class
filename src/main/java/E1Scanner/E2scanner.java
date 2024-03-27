package E1Scanner;

import java.util.Scanner;

public class E2scanner {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("please enter a byte number");
        byte smallBox = scanner.nextByte();
        System.out.println("print enter a double number");
        double bigBox=scanner.nextDouble();
        System.out.println("please enter a boolean value");
        boolean LogicalBox= scanner.nextBoolean();


        System.out.println(smallBox);
        System.out.println(bigBox);
        System.out.println(LogicalBox);



    }
}
