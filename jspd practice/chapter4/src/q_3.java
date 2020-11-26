import java.util.Scanner;

public class q_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter point 1 (latitude and longitude) in degrees: ");
        String point1 = scan.nextLine();
        System.out.println("Enter point 2 (latitude and longitude) in degrees: ");
        String point2 = scan.nextLine();
        int indexOfComma1 = point1.indexOf(',');
        double x1 = Double.parseDouble(point1.substring(0,indexOfComma1));
        double y1 = Double.parseDouble(point1.substring(indexOfComma1+2));
        int indexOfComma2 = point2.indexOf(',');
        double x2 = Double.parseDouble(point2.substring(0,indexOfComma2));
        double y2 = Double.parseDouble(point2.substring(indexOfComma2+2));
        x1 = Math.toRadians(x1);
        y1 = Math.toRadians(y1);
        x2 = Math.toRadians(x2);
        y2 = Math.toRadians(y2);
        double radius = 6371.01;
        double distance = radius*Math.acos((Math.sin(x1)*Math.sin(x2) + (Math.cos(x1)*Math.cos(x2)*Math.cos(y1-y2))));
        System.out.println("The distance between the two points is " + distance + " km");
    }
}
