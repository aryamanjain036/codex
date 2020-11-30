import java.util.Scanner;

public class list5_q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = (int)(Math.random()*101);
        System.out.println("Guess a magic number between 0 and 100");
        System.out.println("Enter your guess: ");
        int guess = scan.nextInt();
        while (guess!= number){
            if (guess<number){
                System.out.println("Your guess is too low");
                guess = scan.nextInt();
            }
            else if(guess>number){
                System.out.println("Your guess is too high");
                guess = scan.nextInt();
            }
        }
        System.out.println("Yes, the number is " + guess);
    }
}