package E1Scanner;
//you are a loan specialist and you are asking how much do they need? if it is equal too 200,00 or less you would lend it to them
import java.util.Scanner;

public class Task1scanner {
    public static void main(String[] args) {
        Scanner question = new Scanner(System.in);
        System.out.println("how much do you need for the loan?");
        int loanAmount = question.nextInt();
        if (loanAmount <= 200000)
        {
            System.out.println("approved");
        } else{
            System.out.println("denied");
        }


    }

}
