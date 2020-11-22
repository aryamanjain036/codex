import java.util.Scanner;

public class q_32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three points for p0, p1, p2 :");
        double x0 = scan.nextDouble();
        double y0 = scan.nextDouble();
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();
        double value = (x1 - x0)*(y2-y0) - (x2-x0)*(y1-y0);
        if (value>0){
            System.out.println("(" + x2 +", " + y2 + ") is on the left side of the line from (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
        }
        else if (value==0){
            System.out.println("(" + x2 +", " + y2 + ") is on the line from (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
        }
        else if (value<0){
            System.out.println("(" + x2 +", " + y2 + ") is on the right side of the line from (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
        }
    }
}
