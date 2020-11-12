import java.util.Scanner;

public class q_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number1 = (int)(Math.random()*10);
        int number2 = (int)(Math.random()*10);
        int number3 = (int)(Math.random()*10);
        System.out.println("Enter the sum of " + number1 + " + "+ number2 + " + "+ number3 + " = ");
        int sum = scan.nextInt();
        System.out.println(number1 + " + " + number2 + " + " + number3 +
                " = " + sum + " is " + (number1+number2+number3==sum));


    }
}
