import java.util.Scanner;

public class q_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 0 - 1000 : ");
        int number = scan.nextInt();
        int zerothPlace = number % 10;
        int tenthPlace1 = number / 10;
        int tenthPlace = tenthPlace1 % 10;
        int hunderdthPlace = tenthPlace1 / 10;
        int total = zerothPlace + tenthPlace + hunderdthPlace;
        System.out.println("The sum of the digits is " + total);
    }
}
