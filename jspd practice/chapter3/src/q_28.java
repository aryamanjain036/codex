import java.util.Scanner;

public class q_28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter r1's center x- , y-coordinate , width, and height :");
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        double width1 = scan.nextDouble();
        double height1 = scan.nextDouble();
        System.out.println("Enter r2's center x- , y-coordinate , width, and height :");
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();
        double width2 = scan.nextDouble();
        double height2 = scan.nextDouble();
        double extremePositiveX1 = x1 + (width1/2);
        double extremeNegativeX1 = x1 - (width1/2);
        double extremePositiveY1 = y1 + (height1/2);
        double extremeNegativeY1 = y1 - (height1/2);
        double extremePositiveX2 = x2 + (width2/2);
        double extremeNegativeX2 = x2 - (width2/2);
        double extremePositiveY2 = y2 + (height2/2);
        double extremeNegativeY2 = y2 - (height2/2);
        if ((extremeNegativeX2>=extremeNegativeX1 && extremePositiveX2<=extremePositiveX1)
        && (extremeNegativeY2>=extremeNegativeY1 && extremePositiveY2<=extremePositiveY1)){
            System.out.println("r2 is inside r1");
        }



    }
}
