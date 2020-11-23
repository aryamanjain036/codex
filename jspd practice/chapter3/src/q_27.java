import java.util.Scanner;

public class q_27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a point's x- and y- coordinates: ");
        double xCoordinate = scan.nextDouble();
        double yCoordinate = scan.nextDouble();
        double midX = 200.0 / 2;
        double midY = 100.0 / 2;
        if (xCoordinate >= 200 && yCoordinate >= 100) {
            System.out.println("The point is not in the triangle");
        }
        else {
            if (xCoordinate > midX && yCoordinate > midY) {
                System.out.println("The point is not in the triangle");
            }
            else {
                System.out.println("The point is in the triangle");
            }
        }
    }
}