import java.util.Scanner;

public class list5_q5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count;
        int sum = 0;
        do {
            System.out.println("Enter an integer (the input ends if it is 0): ");
            count = scan.nextInt();
            sum += count;
        }while (count!=0);
        System.out.println("The sum is " + sum);
    }
}
