import java.util.Scanner;

public class q5_9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int numberOfStudents = scan.nextInt();
        double highestScore = 0;
        double secondHighestScore = 0;
        String highestScoredStudentName = "";
        String secondHighestScoredStudentName = "";
        for (int i=1;i<=numberOfStudents;i++){
            System.out.println("Enter student " + i +" Name and Score: ");
            String nameOfStudent = scan.next();
            double scoreOfStudent = scan.nextInt();
            if (highestScore<scoreOfStudent){
                highestScore = scoreOfStudent;
                highestScoredStudentName = nameOfStudent;

            }
        }
        System.out.println("The student with highest score is " + highestScoredStudentName + " scoring " + highestScore);
    }
}
