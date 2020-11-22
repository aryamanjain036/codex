import java.util.Scanner;

public class q_26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer : ");
         int number = scan.nextInt();
        boolean numberDivisibleByFive = number % 5 == 0;
        boolean numberDivisibleBySix = number % 6 == 0;
        System.out.println("Is " + number + " divisible by 5 and 6? " + (numberDivisibleByFive && numberDivisibleBySix));
        System.out.println("Is " + number + " divisible by 5 or 6? " + (numberDivisibleByFive || numberDivisibleBySix));
        System.out.println("Is " + number + " divisible by 5 or 6, but not both? " + (numberDivisibleByFive ^ numberDivisibleBySix));
    }
}
