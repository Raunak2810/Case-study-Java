// This Java program checks whether a driver is eligible for insurance based on their marital status, gender, and age. The program uses nested if statements to check for different conditions based on the driver's marital status.
// If the driver is unmarried (marital variable equals 'U' or 'u'), the program prompts the user to enter their gender and age. If the driver is male and over 30 or female and over 25, the program prints "You are Eligible for Insurance". Otherwise, the program prints "You are Not Eligible for Insurance".
// If the driver is married (marital variable equals 'M' or 'm'), the program assumes that they are eligible for insurance and prints "You are Eligible for Insurance". If the marital variable is neither 'M' nor 'U', the program prints "Invalid Input".
import java.util.Scanner;
class Nestedif{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        char marital;
        System.out.print("Enter your marital status (M for married, U for unmarried): ");
        marital= sc.next().charAt(0);
        if (marital == 'U' || marital == 'u') {
            char gender;
            int age;
            System.out.print("Enter your gender (M for male, F for female): ");
            gender= sc.next().charAt(0);
            System.out.print("Enter your age: ");
            age= sc.nextInt();
            if ((gender == 'M' || gender == 'm') && age > 30) {
                System.out.println("You are Eligible for Insurance");
            } else if ((gender == 'F' || gender == 'f') && age > 25) {
                System.out.println("You are Eligible for Insurance");
            } else {
                System.out.println("You are Not Eligible for Insurance");
            }
        } else if (marital == 'M' || marital == 'm') {
            System.out.println("You are Eligible for Insurance");
        } else {
            System.out.println("Invalid Input");
        }
    }
}