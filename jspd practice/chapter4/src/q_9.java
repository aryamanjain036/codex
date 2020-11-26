import java.util.Scanner;

public class q_9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char character = scan.next().charAt(0);
        int unicode = (int)(character);
        System.out.println("The Unicode for the character "+ character + " is " + unicode);

    }
}
