import java.util.Scanner;

public class q5_16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = scan.nextInt();
        int divisor=2;
        while (number/divisor != 0){
            if (number%divisor==0){
                System.out.print(divisor + " ");
                number = number/divisor;
            }
            else divisor++;
        }
    }
}
