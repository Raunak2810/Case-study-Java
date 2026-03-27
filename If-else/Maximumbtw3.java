// This Java program prompts the user to input three numbers and then finds and prints the maximum of the three numbers using conditional statements.

// The Scanner class is used to read input from the user, and the program prompts the user to enter the first number and stores it in the variable num1. It then prompts the user to enter the second number and stores it in the variable num2. Finally, it prompts the user to enter the third number and stores it in the variable num3.
// The program then uses a series of if-else statements to determine which number is greater. If num1 is greater than both num2 and num3, it prints the message "Maximum Number is [num1]". If num2 is greater than both num1 and num3, it prints the message "Maximum Number is [num2]". If both num1 and num2 are smaller than num3, it prints the message "Maximum Number is [num3]".
// It is worth noting that the if-else statement in the original code contains a logical error. Specifically, the condition in the second else if statement should check if num3 is greater than both num1 and num2 (i.e., num3>num1 && num3>num2), but it only checks if num3 is greater than num2. This can result in incorrect output if num3 is not the largest of the three input numbers.
import java.util.Scanner;
class Maximumbtw3{
    public static void main(String[]args){
    Scanner sc = new Scanner (System.in);
    System.out.println("pehla no. do: ");
    int num1 = sc.nextInt();
    System.out.println("Dusra no do: ");
    int num2 = sc.nextInt();
    System.out.println("Tisra no. do: ");
    int num3 = sc.nextInt();
    if (num1>num2 && num1>num3)
         System.out.println("maximum value is :-"+ num1);
    else if (num1<num2 && num3<num2)
        System.out.println("maximum value is :-"+num2);
    else
        System.out.println("maximum value is " +num3);
    }
}