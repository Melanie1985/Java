import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
      inputInt();
      //inputString();
    }
    public static void inputString(){
        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter your name: ");

        String name = userInput.nextLine();

        System.out.println("Your name is: " + name);
    }

    public static void inputInt(){
        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter a number: ");

        int number = userInput.nextInt();

        System.out.println("The number you entered is: " + number);
    }
}
