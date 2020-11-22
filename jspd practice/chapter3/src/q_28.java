import java.util.Scanner;

public class q_28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter r1's center x- , y-coordinate , width, and height :");
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        double width1 = scan.nextDouble();
        double height1 = scan.nextDouble();
        double finalWidth1 = width1*2;
        double finalHeight1 = height1*2;
        System.out.println("Enter r2's center x- , y-coordinate , width, and height :");
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();
        double width2 = scan.nextDouble();
        double height2 = scan.nextDouble();
        double finalWidth2 = width2*2;
        double finalHeight2 = height2*2;
        double distanceBetweenCoordinates = Math.pow(Math.pow(x2-x1,2)+Math.pow(y2-y1,2),0.5);
        if (distanceBetweenCoordinates<=width1 || distanceBetweenCoordinates<= height1){
            
        }
    }
}
