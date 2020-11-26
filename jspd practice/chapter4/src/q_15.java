import java.util.Scanner;

public class q_15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a letter: ");
        char letter = scan.next().charAt(0);
        char temp = Character.toLowerCase(letter);
        int number;
        if (temp=='a' || temp=='b' || temp=='c'){
            number = 2;
            System.out.println("The corresponding number is " + number);
        }
        else if (temp=='d' || temp=='e' || temp=='f'){
            number = 3;
            System.out.println("The corresponding number is " + number);
        }
        else if (temp=='g' || temp=='h' || temp=='i'){
            number = 4;
            System.out.println("The corresponding number is " + number);
        }
        else if (temp=='j' || temp=='k' || temp=='l'){
            number = 5;
            System.out.println("The corresponding number is " + number);
        }
        else if (temp=='m' || temp=='n' || temp=='o'){
            number = 6;
            System.out.println("The corresponding number is " + number);
        }
        else if (temp=='p' || temp=='q' || temp=='r' || temp=='s'){
            number = 7;
            System.out.println("The corresponding number is " + number);
        }
        else if (temp=='t' || temp=='u' || temp=='v'){
            number = 8;
            System.out.println("The corresponding number is " + number);
        }
        else if (temp=='w' || temp=='x' || temp=='y' || temp=='z'){
            number = 9;
            System.out.println("The corresponding number is " + number);
        }
        else if (temp==' '){
            number=0;
            System.out.println("The corresponding number is " + number);
        }
        else System.out.println(letter + " is an invalid input");
    }
}
