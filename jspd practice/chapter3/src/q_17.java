import java.util.Scanner;

public class q_17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("scissor (0), rock (1), paper (2): ");
        int yourPlay = scan.nextInt();
        int gamePlay = (int)(Math.random()*3);
        if (yourPlay == 0 && gamePlay == 0 || yourPlay == 1 && gamePlay == 1 || yourPlay == 2 && gamePlay == 2){

        }
    }
}
