import java.util.Scanner;

public class operator
{
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter First Number:- ");
        int first= input.nextInt();
        System.out.println("Enter Second Number:- ");
        int second= input.nextInt();
        int sub=first-second;
        System.out.println("Enter One of the Operator(+,-,/,*)");
        char operator = input.next().charAt(0);
        if (operator=='+')
        {
            System.out.println("the sum of two numbers is "+ (first + second));
        } else if (operator=='*') {
            System.out.println("the multiplication of two numbers is "+ (first * second));
        }else if (operator=='/') {
            System.out.println("the division of two numbers is "+ (first / second));
        }else if (operator=='-') {
            System.out.println("the subtraction of two numbers is "+ (first-second));
        }
    }
}