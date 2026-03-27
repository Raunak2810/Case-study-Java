//The program begins by declaring a variable avg to store the user input for average marks. It then prompts the user to enter the average mark using the System.out.println() statement.
import java.util.Scanner;
class Average{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        float avg;
        System.out.print("enter the average marks:- ");
        avg= sc.nextFloat();
        if (avg >= 90 && avg <= 100){
           System.out.print("Grade A");
        }
        else if (avg >=80 && avg <= 89){
             System.out.print("Grade B");
        }
        else if (avg>=60 && avg <=79){
             System.out.print("Grade C");
        }
        else{
             System.out.print("Grade F");
        }
    }  
}