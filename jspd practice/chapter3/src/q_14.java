import java.util.Scanner;

public class q_14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Guess heads or tails : ");
        String guess = scan.nextLine();
        int random = (int)(Math.random()*2);
        if (random == 0 && guess.equals("heads")){
            System.out.println("the guess is correct");
        }
        if (random == 1 && guess.equals("tails")){
            System.out.println("the guess is correct");
        }
        if ((random == 0 && guess.equals("tails")) || (random == 1 && guess == "heads")){
            System.out.println("the guess is incorrect");
        }

    }
}
