import java.util.Scanner;

public class q_16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int xCoordinate = (int)(Math.random()*(50+50) -50);
        int yCoordinate = (int)(Math.random()*(100+100) -100);
        System.out.println("the coordinate are " + "(" + xCoordinate + ", " + yCoordinate + ")");

    }
}
