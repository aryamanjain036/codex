import java.util.Scanner;

public class q_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of sides: ");
        int numberOfSides = scan.nextInt();
        System.out.println("Enter the side: ");
        double side = scan.nextDouble();
        double area = (numberOfSides * Math.pow(side,2)) / (4 * Math.tan(Math.PI/numberOfSides));
        System.out.println("The area of the polygon is " + area);
    }
}
