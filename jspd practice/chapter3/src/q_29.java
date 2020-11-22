import java.util.Scanner;

public class q_29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter circle1's center x-, y-coordinates, and radius:");
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        double radius1 = scan.nextDouble();
        System.out.println("Enter circle2's center x-, y-coordinates, and radius:");
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();
        double radius2 = scan.nextDouble();
        double finalRadius = radius1-radius2;
        double distance = Math.pow(Math.pow(x2-x1,2) + Math.pow(y2-y1,2),0.5);
        if (distance<=Math.abs(finalRadius)){
            System.out.println("circle2 is inside circle1");
        }
        else if (distance<= (radius1+radius2)){
            System.out.println("circle2 overlaps circle1");
        }
        else {
            System.out.println("circle2 does not overlap circle1");
        }

    }
}
