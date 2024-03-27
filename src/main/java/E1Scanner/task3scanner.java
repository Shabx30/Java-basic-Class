package E1Scanner;
//create a java program to cconvert fernheit to selsios and print "The temperture in the city ___is __"+
import java.sql.SQLOutput;
import java.util.Scanner;

public class task3scanner {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter your city");
        String City= scanner.nextLine();

        System.out.println("What is is the temperture in your city");
        double temperature= scanner.nextDouble();
        double tempCelsius=(temperature-32) * 5/9;
        System.out.println("the tempature in " +City+ " is "+ tempCelsius+" C");
    }
}
