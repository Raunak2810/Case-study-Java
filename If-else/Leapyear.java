//This is a Java program that checks whether a given year is a leap year or not using an if-else statement. Here's how the program works:
import java.util.Scanner;
class Leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.print("enter the year:- ");
        year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("the year is leap year");
        } else {
            System.out.println("the year is not a leap year");
        }
    }
}