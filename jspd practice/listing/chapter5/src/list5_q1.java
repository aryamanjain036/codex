import java.util.Scanner;

public class list5_q1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number1 = (int)(Math.random()*10);
        int number2 = (int)(Math.random()*10);
        System.out.println("What is " + number1 + " + " + number2 + "? ");
        int answer = scan.nextInt();
        while (answer!= (number1+number2)){
            System.out.println("Wrong answer. try again. What is " + number1 + " + " + number2 + "? ");
            answer = scan.nextInt();
        }
        System.out.println("You got it!");
    }
}
