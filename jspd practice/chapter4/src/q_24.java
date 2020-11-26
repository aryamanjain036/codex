import java.util.Scanner;

public class q_24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first city: ");
        String city1 = scan.nextLine();
        System.out.println("Enter the second city: ");
        String city2 = scan.nextLine();
        System.out.println("Enter the third city: ");
        String city3 = scan.nextLine();
        int n1 = (int)(city1.charAt(0));
        int n2 = (int)(city2.charAt(0));
        int n3 = (int)(city3.charAt(0));
        if (n1<n2 && n2<n3){
            System.out.println("The three cities in alphabetic order are " + city1 + " " + city2 + " " + city3);
        }
        if (n1<n2 && n2>n3){
            if (n1<n3){
                System.out.println("The three cities in alphabetic order are " + city1 + " " + city3 + " " + city2);
            }
            else System.out.println("The three cities in alphabetic order are " + city3 + " " + city1 + " " + city2);
        }
        if (n1>n2 && n2>n3){
            System.out.println("The three cities in alphabetic order are " + city3 + " " + city2 + " " + city1);
        }
        if (n1>n2 && n2<n3){
            if (n1<n3){
                System.out.println("The three cities in alphabetic order are " + city2 + " " + city1 + " " + city3);
            }
            else System.out.println("The three cities in alphabetic order are " + city2 + " " + city3 + " " + city1);
        }
    }
}
