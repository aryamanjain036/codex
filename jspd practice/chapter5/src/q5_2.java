import java.util.Scanner;

public class q5_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int numberOfQuestion = 10;
        int correctCount=0;
        int count=0;
        long startTime = System.currentTimeMillis();
        String output = "";
        while (count<numberOfQuestion){
            int number1 = (int)(Math.random()*15+1);
            int number2 = (int)(Math.random()*15+1);

            System.out.println("What is " + number1 + " + " + number2 + " ?");
            int answer = scan.nextInt();
            if (number1+number2 == answer){
                System.out.println("You are correct!");
                correctCount++;
            }else System.out.println("Your answer is wrong.\n" + number1 + " + " + number2 + " should be " + (number1+number2));

            count++;
            output += "\n"+ number1 + " + " + number2 + " = " + ((number1+number2 == answer) ? "correct" : "wrong");
        }
        long endTime = System.currentTimeMillis();
        long finalTime = endTime-startTime;
        System.out.println("\nCorrect count is " + correctCount +
                "\nTest time is " + finalTime/1000 + " seconds\n" + output);
    }
}
