import java.util.Scanner;

public class list4_q1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three points: ");
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();
        double x3 = scan.nextDouble();
        double y3 = scan.nextDouble();
        double a = Math.pow(x3-x2,2) + Math.pow(y3-y2,2);
        a = Math.sqrt(a);
        double b = Math.pow(x3-x1,2) + Math.pow(y3-y1,2);
        b = Math.sqrt(b);
        double c = Math.pow(x1-x2,2) + Math.pow(y1-y2,2);
        c = Math.sqrt(c);
        double angleA = (a * a - b * b - c * c)/(-2 * b * c);
        angleA = Math.toDegrees(Math.acos(angleA));
        double angleB = (b * b - a * a - c * c)/(-2 * a * c);
        angleB = Math.toDegrees(Math.acos(angleB));
        double angleC = (c * c - b * b - a * a)/(-2 * a * b);
        angleC = Math.toDegrees(Math.acos(angleC));
        System.out.println("The three angles are " + Math.round(angleA*100)/100.0 + " " + Math.round(angleB*100)/100.0 + " " + Math.round(angleC*100)/100.0);
    }
}
