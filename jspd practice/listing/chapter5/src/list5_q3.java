import java.util.Scanner;

public class list5_q3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOFQuestions = 5;
        int questionCounter = 0;
        int correctCounter=0;
        String output = "";
        long startTime = System.currentTimeMillis();
        while (questionCounter<numberOFQuestions){
            int number1 = (int)(Math.random()*10);
            int number2 = (int)(Math.random()*10);
            System.out.println("What is " + number1 + " - " + number2 + "?");
            int guess = scan.nextInt();
            if (guess!=(number1-number2)){
                System.out.println("Your answer is wrong.");
                System.out.println(number1 + " - " + number2 + " should be " + (number1-number2) + "\n");
            }
            else {
                System.out.println("You are correct!\n");
                correctCounter++;
            }
            questionCounter++;
            output += "\n" + number1 + " - " + number2 + " = " + guess + ((number1-number2 == guess) ? " correct":" wrong");
        }
        long endTIme = System.currentTimeMillis();
        long finalTime = endTIme-startTime;
        System.out.println("Correct count is " + correctCounter);
        System.out.println("Test time is " + finalTime + " seconds");
        System.out.println(output);
    }
}
