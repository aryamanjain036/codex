import java.util.Scanner;

public class q_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius and length of a cylinder");
        double radius = scan.nextDouble();
        double length = scan.nextDouble();
        double area = radius * radius * 3.141;
        double volume = area*length;
        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);
    }
}
