import java.util.Scanner;

public class q5_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int numberOfStudents = scan.nextInt();
        double max =0;
        String highestScoredStudentName = "";
        for (int i=1;i<=numberOfStudents;i++){
            System.out.println("Enter student " + i +" Name and Score: ");
            String nameOfStudent = scan.next();
            double scoreOfStudent = scan.nextInt();
            if (max<scoreOfStudent){
                max = scoreOfStudent;
                highestScoredStudentName = nameOfStudent;
            }
        }
        System.out.println("The student with highest score is " + highestScoredStudentName + " scoring " + max);
    }
}
