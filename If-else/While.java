// This Java program prompts the user to input a number and then prints out all the integers from 1 up to that number using a while loop.
import java.util.Scanner;
class While{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.print("Enter a number: ");
        n= sc.nextInt();
        int i=1;
        while(i<=n){
            System.out.println(i);
            i++;
        }
    }
}