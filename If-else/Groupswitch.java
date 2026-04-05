// This is a Java program that uses a switch statement to check whether a given character is a vowel or a consonant.
import java.util.Scanner;
class Groupswitch{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        char ch;
        System.out.print("Enter a character: ");
        ch= sc.next().charAt(0);
        switch(ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(ch + " is a vowel.");
                break;
            default:
                System.out.println(ch + " is a consonant.");
        }
    }
}   