import java.util.Scanner;

public class q_13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a letter: ");
        char letter = scan.next().charAt(0);
        char temp = Character.toLowerCase(letter);
        if (Character.isLetter(temp)){
            if (temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u'){
                System.out.println(letter + " is a vowel");
            }
            else System.out.println(letter + " is a constant");
        }
        else System.out.println(letter + " is  an invalid input");

    }
}
