import java.util.Scanner;

public class q_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an ASCII code: ");
        int ascii = scan.nextInt();
        char character = (char)(ascii);
        System.out.println("THe character for ASCII code " + ascii + " is " + character);
    }
}
