import java.util.Scanner;

public class q_15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a three-digit number : ");
        int guessNumber = scan.nextInt();
        int lotteryNumber = (int)(Math.random()*1000);
        int guessNumber3 = guessNumber%10;
        int tempNumber = guessNumber/10;
        int guessNumber2 = tempNumber%10;
        int guessNumber1 = tempNumber/10;
        int lotteryNumber3 = lotteryNumber%10;
        int tempNumber2 = lotteryNumber/10;
        int lotteryNumber2 = tempNumber2%10;
        int lotteryNumber1 = tempNumber2/10;
        System.out.println("The lottery number is " + lotteryNumber);
        if (guessNumber == lotteryNumber){
            System.out.println("Exact match: you win $10,000");
        }
        else if (((guessNumber1 == lotteryNumber1)||(guessNumber1 == lotteryNumber2)||(guessNumber1 == lotteryNumber3))
                && ((guessNumber2 == lotteryNumber1)||(guessNumber2 == lotteryNumber2)||(guessNumber2 == lotteryNumber3))
                && ((guessNumber3 == lotteryNumber1)||(guessNumber3 == lotteryNumber2)||(guessNumber3 == lotteryNumber3))){
            System.out.println("Match all digits: you win $3,000");
        }
        else if (((guessNumber1 == lotteryNumber1)||(guessNumber1 == lotteryNumber2)||(guessNumber1 == lotteryNumber3))
                || ((guessNumber2 == lotteryNumber1)||(guessNumber2 == lotteryNumber2)||(guessNumber2 == lotteryNumber3))
                || ((guessNumber3 == lotteryNumber1)||(guessNumber3 == lotteryNumber2)||(guessNumber3 == lotteryNumber3))){
            System.out.println("Match one digit: you win $1,000");
        }
        else
            System.out.println("Sorry: no match");

    }
}
