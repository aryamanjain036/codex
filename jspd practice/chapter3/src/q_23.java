import java.util.Scanner;

public class q_23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a point with two coordinates : ");
        double point1= scan.nextDouble();
        double point2 = scan.nextDouble();
        double verticalDistance = point2-0;
        double horizontalDistance = point1-0;
        if ((verticalDistance > (5.0/2)) || (horizontalDistance > 10.0/2)){
            System.out.println("Point (" + point1 + ", " + point2 + ") is not in the rectangle");
        }
        else {
            System.out.println("Point (" + point1 + ", " + point2 + ") is in the rectangle");
        }
    }
}
