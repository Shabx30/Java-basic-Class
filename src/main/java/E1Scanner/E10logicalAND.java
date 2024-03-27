package E1Scanner;
// f+f=F
//F+T=F
//T+f=f
//t+t= true true is only true when both variables are true
import org.example.class1.Main;

import java.sql.SQLOutput;

public class E10logicalAND {
    public static void main(String[] args) {
        double math=95;
        double science=82;
        double history =93;

        if(math>90 && science >90 && history >90){
            System.out.println("great work you have an A+");} else {
            System.out.println("you need to work harder");}
    }
}
