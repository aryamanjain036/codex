import java.util.Scanner;

public class q_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number1 = (int)(Math.random()*100);
        int number2 = (int)(Math.random()*100);
        System.out.println("What is the sum of " + number1 + " + " + number2 + " : ");
        int sum = scan.nextInt();
        System.out.println("the sum of " + number1 + " + " + number2 + " = " + sum + " is " + (number1+number2==sum) );
    }
}
