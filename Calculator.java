import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        //declare variables
        int num1, num2;
        char operator;

        //create Scanner class object to read inputs
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        num1 = scan.nextInt();
        num2 = scan.nextInt();

        //read operator
        System.out.println("Operators " + "are: (+ - * / %)");
        System.out.print("Enter operator: ");
        operator = scan.next().charAt(0);

        //switch case statements
        switch (operator) {
            case '+':
                System.out.println("Answer = " + (num1 + num2));
                break;

            case '-':
                System.out.println("Answer = " + (num1 - num2));
                break;

            case '*':
                System.out.println("Answer = " + (num1 * num2));
                break;

            case '/':
                System.out.println("Answer = " + (num1 / num2));
                break;

            case '%':
                System.out.println("Answer = " + (num1 % num2));
                break;

            default:
                System.out.println("Invalid operator");


        }
    }

}
