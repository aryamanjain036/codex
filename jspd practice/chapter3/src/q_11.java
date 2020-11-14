import java.util.Scanner;

public class q_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the month and the year : ");
        int month = scan.nextInt();
        int year = scan.nextInt();
        String nameOfMonth;
        int daysOfMonth;
        switch (month){
            case 1:
                nameOfMonth = "January";
                daysOfMonth = 31;
                System.out.println(nameOfMonth + " " + year + " had " + daysOfMonth + " days");
                break;
            case 2:
                nameOfMonth = "February";
                if ((year%4 ==0 && year%100!=0)||(year%400==0)) {
                    daysOfMonth = 29;
                }
                else {
                    daysOfMonth = 28;
                }
                System.out.println(nameOfMonth + " " + year + " had " + daysOfMonth + " days");
                break;
            case 3:
                nameOfMonth = "March";
                daysOfMonth = 31;
                System.out.println(nameOfMonth + " " + year + " had " + daysOfMonth + " days");
                break;
            case 4:
                nameOfMonth = "April";
                daysOfMonth = 30;
                System.out.println(nameOfMonth + " " + year + " had " + daysOfMonth + " days");
                break;
            case 5:
                nameOfMonth = "May";
                daysOfMonth = 31;
                System.out.println(nameOfMonth + " " + year + " had " + daysOfMonth + " days");
                break;
            case 6:
                nameOfMonth = "June";
                daysOfMonth = 30;
                System.out.println(nameOfMonth + " " + year + " had " + daysOfMonth + " days");
                break;
            case 7:
                nameOfMonth = "July";
                daysOfMonth = 31;
                System.out.println(nameOfMonth + " " + year + " had " + daysOfMonth + " days");
                break;
            case 8:
                nameOfMonth = "August";
                daysOfMonth = 31;
                System.out.println(nameOfMonth + " " + year + " had " + daysOfMonth + " days");
                break;
            case 9:
                nameOfMonth = "September";
                daysOfMonth = 30;
                System.out.println(nameOfMonth + " " + year + " had " + daysOfMonth + " days");
                break;
            case 10:
                nameOfMonth = "October";
                daysOfMonth = 31;
                System.out.println(nameOfMonth + " " + year + " had " + daysOfMonth + " days");
                break;
            case 11:
                nameOfMonth = "November";
                daysOfMonth = 30;
                System.out.println(nameOfMonth + " " + year + " had " + daysOfMonth + " days");
                break;
            case 12:
                nameOfMonth = "December";
                daysOfMonth = 31;
                System.out.println(nameOfMonth + " " + year + " had " + daysOfMonth + " days");
                break;
        }
    }
}
