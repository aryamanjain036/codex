import java.util.Scanner;

public class list5_q4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer (the input ends if it is 0): ");
        int count = scan.nextInt();
        int sum = 0;
        while (count!=0){
            sum += count;
            System.out.println("Enter an integer (the input ends if it is 0): ");
            count = scan.nextInt();
        }
        System.out.println("The sum is " + sum);
    }
}
