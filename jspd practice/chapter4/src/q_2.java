import java.util.Scanner;

public class q_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter point 1 (latitude and longitude) in degrees: ");
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        System.out.println("Enter point 2 (latitude and longitude) in degrees: ");
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();
        double radius = 6371.01;
        double distance = radius * Math.acos(Math.toRadians((Math.sin(x1))*Math.toRadians(Math.sin(x2)) + (Math.toRadians(Math.cos(x1))*Math.toRadians(Math.cos(x2))*Math.toRadians(Math.cos((y1-y2))))));
        System.out.println("The distance between the two points is " + distance + "km");
    }
}
