import java.util.Scanner;

public class q_19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter three points for a triangle :");
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();
        double x3 = scan.nextDouble();
        double y3 = scan.nextDouble();
        double side1 = Math.pow(Math.pow(x2-x1,2)+Math.pow(y2-y1,2),0.5);
        double side2 = Math.pow(Math.pow(x3-x2,2)+Math.pow(y3-y2,2),0.5);
        double side3 = Math.pow(Math.pow(x3-x1,2)+Math.pow(y3-y1,2),0.5);
        double sideS = (side1+side2+side3)/2;
        double underArea = sideS*((sideS-side1)*(sideS-side2)*(sideS-side3));
        float area = (float) Math.pow(underArea,.5);
        System.out.println("The area of the triangle is " + area);
    }
}
