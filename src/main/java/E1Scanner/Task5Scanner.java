package E1Scanner;

import org.example.class1.Main;

import java.util.Scanner;

//WRITE A PROGRAM TO ENTER NUMBER OF WORKED YEARS AND ANNUAL SALARY. IF THE USER WORKED FOR MORE OR EQUAL TO 5
// YEARS THEN USER IS ELIGIBLE FOR THE BONUS OTHERWISE HE IS NOT.
// ONCE USER IS ELIGIBLE AND SALARY IS LARGER THAN 50000 THAN BONUS =5000 OTHERWISE BONUS =3000
public class Task5Scanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("How many years have you worked?");
        double year= scanner.nextDouble();

        if (year>=5){
            System.out.println("What is your annual salary?");
            int salary= scanner.nextInt();

            System.out.println("You are Eligible for bonus!"); if(salary>50000){
            System.out.println("your bonus is 5000"); }else {

            System.out.println("Your bonus is 3000");} }else {
            System.out.println("you are not eligible");


        }}}
