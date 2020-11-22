import java.util.Scanner;

public class q_17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("scissor (0), rock (1), paper (2): ");
        int yourPlay = scan.nextInt();
        int gamePlay = (int)(Math.random()*3);
        System.out.print("The computer is ");
        switch (gamePlay){
            case 0:
                System.out.print("scissor");
                break;
            case 1:
                System.out.print("rock");
                break;
            case 2:
                System.out.print("paper");
                break;
        }
        System.out.print(". You are ");
        switch (yourPlay){
            case 0:
                System.out.print("scissor");
                break;
            case 1:
                System.out.print("rock");
                break;
            case 2:
                System.out.print("paper");
                break;
        }
        if (gamePlay == yourPlay){
            System.out.println(" too. It is a draw");
        }
        else {
            if (yourPlay==0 && gamePlay==2 || yourPlay==1 && gamePlay==0 || yourPlay==2 && gamePlay==1){
                System.out.println(" . You win");
            }
            else System.out.println(" . You lose");
        }
    }
}
