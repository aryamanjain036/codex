import java.util.Scanner;

public class list5_q7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first integer: ");
        int num1 = scan.nextInt();
        System.out.println("Enter second integer: ");
        int num2 = scan.nextInt();
        int gcd = 1;
        int k = 2;
        while (k<=num1 && k<= num2){
            if (num1%k ==0 && num2%k ==0){
                gcd = k;
                k++;
            }
        }
        System.out.println("The greatest common divisor for "+ num1 + "and " + num2 + " is " + gcd);
    }
}
