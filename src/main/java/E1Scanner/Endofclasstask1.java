package E1Scanner;

import java.util.Scanner;

// prompt user mean use scanner because scanner is what user neeed to type in information
// user to enter person height in inches person should be classifed as one of the following: short under 60 inch, medium between 60-72 inch tall over 72 inch
public class Endofclasstask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("what is your height? please list in inches");
        double height = scanner.nextDouble();

        //how to classify height
        if(height<60) {
            System.out.println("Short"); }else if (height>=60 && height<=72){
            System.out.println("Medium");}else {
            System.out.println("Tall");}
                 }
        }



















































































































































































































































































































































































































































































































































































































































































































































































































































































































































