import java.util.Scanner;

public class q_20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String para = scan.nextLine();
        int firstSpace = para.indexOf(' ');
        String firstChar = para.substring(0,firstSpace);
        System.out.println("The first character is " + firstChar);
    }
}
