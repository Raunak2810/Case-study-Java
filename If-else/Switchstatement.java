// This is a Java program that demonstrates the use of the switch statement. The program prompts the user to choose an operation to perform (addition, subtraction, multiplication, or division), and then prompts the user to enter two numbers. The program then performs the selected operation on the two numbers and prints the result.
import java.util.Scanner;
class Switchstatement{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int choice;
        System.out.println("koi operation batao :");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        choice= sc.nextInt();
        System.out.print("Enter first number: ");
        int num1= sc.nextInt();
        System.out.print("Enter second number: ");
        int num2= sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Result: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Result: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Result: " + (num1 * num2));
                break;
            case 4:                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}   