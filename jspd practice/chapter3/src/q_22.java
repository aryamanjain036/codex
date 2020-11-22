import java.util.Scanner;

public class q_22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a point with two coordinates : ");
        double point1 = scan.nextDouble();
        double point2 = scan.nextDouble();
        double distance = Math.pow(Math.pow(point1-0,2)+Math.pow(point2-0,2),.5);
        if (distance>10){
            System.out.println("Point (" + point1 + ", " + point2 + ")" + "is not in the circle");
        }
        else {
            System.out.println("Point (" + point1 + ", " + point2 + ")" + "is in the circle");
        }
    }
}
