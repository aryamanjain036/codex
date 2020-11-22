import java.util.Scanner;

public class q_34 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three points for p0, p1, p2 :");
        double x0 = scan.nextDouble();
        double y0 = scan.nextDouble();
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();

        if ((((x0 <= x2) && (x2 <= x1)) || ((x0 >= x2) && (x2 >= x1)))){
            System.out.println("(" + x2 +", " + y2 + ") is on the line segment from (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
        }
        else {
            System.out.println("(" + x2 +", " + y2 + ") is not on the line segment from (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
        }
    }
}
