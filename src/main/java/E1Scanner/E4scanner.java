package E1Scanner;
//next Line allows multiple lines of word or paragraph, but next only prints the one words like when we put first name on E3 it only took the first name not the last
import java.util.Scanner;

public class E4scanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your name");
        String name= scanner.nextLine();
        System.out.println(name);
    }
}
