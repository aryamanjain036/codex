import java.util.Scanner;

public class q_18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two character: ");
        String character = scan.nextLine();
        char character1 = character.charAt(0);
        char character2 = character.charAt(1);
        switch (character1){
            case 'M':
                System.out.print("Mathematics");
                break;
            case 'C':
                System.out.print("Computer Science");
                break;
            case 'I':
                System.out.print("Information Technology");
                break;
            default:
                System.out.println("Invalid input");
                System.exit(1);
                break;
        }
        System.out.print(" ");
        switch (character2){
            case '1':
                System.out.print("Freshman");
                break;
            case '2':
                System.out.print("Sophomore");
                break;
            case '3':
                System.out.print("Junior");
                break;
            case '4':
                System.out.print("Senior");
                break;
            default:
                System.out.print("Invalid input");
                break;
        }
    }
}
