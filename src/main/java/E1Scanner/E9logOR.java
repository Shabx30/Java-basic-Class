package E1Scanner;
//if i have 30000 in cahs or i  bank i can buy a toyta if i dont then i cant buy
public class E9logOR {
    public static void main(String[] args) {
        double bankBalance=50000;
        double cash =40000;
        if (bankBalance> 30000 || cash>30000){
            System.out.println("I can buy a toyota");} else {
            System.out.println("I need to save more");
        }

    }
}
