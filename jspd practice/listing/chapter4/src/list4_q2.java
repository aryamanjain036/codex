import java.util.Scanner;

public class list4_q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first city: ");
        String city1 = scan.nextLine();
        System.out.println("Enter the second city: ");
        String city2 = scan.nextLine();
        if (city1.compareToIgnoreCase(city2)<0){
            System.out.println("The cities is alphabetical order are " + city1 + " " + city2);
        }
        else System.out.println("The cities is alphabetical order are " + city2 + " " + city1);
    }
}
