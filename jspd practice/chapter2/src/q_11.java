import java.util.Scanner;

public class q_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number od years : ");
        int years = scan.nextInt();
        int totalTime = 365 * 24 * 60 * 60;
        int birthCount = totalTime / 7;
        int deathCount = totalTime / 13;
        int immigrantCount = totalTime / 45;
        int currentPopulation = 312032486;
        int newcurrentPopulation = birthCount + immigrantCount - deathCount;
        int finalPopulation = currentPopulation + (newcurrentPopulation * years);
        System.out.println("The population in " + years + " years is " + finalPopulation);
    }
}
