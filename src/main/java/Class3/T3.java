package Class3;
//write a program tp print the area and perimeter of a rectangle with width =5 and height=8 your program should say
// " The perimeter of a rectangle with width _ and height _ is equal _ and the area is_"

public class T3 {
    public static void main(String[] args) {
        int num1=5;
        int num2 =8;
        int answer1= 2*(num1*num2);
        int answer2= (num1*num2);

        System.out.println("The perimeter of a rectangle with width " +num1+ " and height "+num2+ " is equal "+ answer1 +" and the area is "+answer2+".");

    }
}
