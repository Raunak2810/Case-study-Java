//This Java program prompts the user to input two numbers and then finds and prints the maximum of the two numbers using conditional statements.
//The Scanner class is used to read input from the user, and the program prompts the user to enter the first number and stores it in the variable num1. It then prompts the user to enter the second number and stores it in the variable num2.
//The program then uses an if-else statement to determine which number is greater. If num1 is greater than num2, it prints the message "Maximum Number is [num1]". If num1 is less than num2, it prints the message "Maximum Number is [num2]". If both numbers are equal, it prints the message "Both are Equal [num1]".
import java.util.Scanner;
class Maximum{
    public static void main(String[]args){
            Scanner sc = new Scanner (System.in);
            System.out.println("pehla no. do: ");
            int num1 = sc.nextInt();
            System.out.println("Dusra no do: ");
            int num2 = sc.nextInt();
            if (num1>num2)
                System.out.println("maximum value is :-"+ num1);
            else if (num1<num2)
                System.out.println("maximum value is :-"+num2);
            else
                System.out.println("both are equal " +num1);
    }
}        
            
