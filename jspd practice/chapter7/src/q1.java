import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int number = scan.nextInt();
        int[] marks = new int[number];
        int max=0;
        System.out.println("Enter " + number + " scores: ");
        for(int i=0;i<marks.length;i++){
            marks[i] = scan.nextInt();
            if(marks[i]>max){
                max = marks[i];
            }
        }
        for(int i=0;i<marks.length;i++){
            String grade;
            if(marks[i]>=(max-10)){
                grade = "A";
            }
            else if(marks[i]>=(max-20) && marks[i]<max-10){
                grade = "B";
            }
            else if(marks[i]>=(max-30) && marks[i]<max-20){
                grade = "C";
            }
            else if(marks[i]>=(max-40) && marks[i]<max-30){
                grade = "D";
            }
            else
                grade = "F";
            System.out.print("Student " + i + " score is "
            + marks[i] + " and the grade is " + grade);
            System.out.println();
        }

    }
}
