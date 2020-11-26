import java.util.Scanner;

public class q_17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a year: ");
        String year = scan.nextLine();
        int yearNum = Integer.parseInt(year);
        System.out.println("Enter a month: ");
        String month = scan.nextLine();
        int odd = 31;
        int even = 30;
        int feb = 28;
        int febLeap = 29;
        if (month.equals("Jan")){
            System.out.println(month + " " + yearNum + " has " + odd + " days");
        }
        if (month.equals("Feb")){
            if ((yearNum%4==0 && yearNum%100!=0)||(yearNum%400==0)){
                System.out.println(month + " " + yearNum + " has " + febLeap + " days");
            }
            else System.out.println(month + " " + yearNum + " has " + feb + " days");
        }
        if (month.equals("Mar")){
            System.out.println(month + " " + yearNum + " has " + odd + " days");
        }
        if (month.equals("Apr")){
            System.out.println(month + " " + yearNum + " has " + even + " days");
        }
        if (month.equals("May")){
            System.out.println(month + " " + yearNum + " has " + odd + " days");
        }
        if (month.equals("Jun")){
            System.out.println(month + " " + yearNum + " has " + even + " days");
        }
        if (month.equals("Jul")){
            System.out.println(month + " " + yearNum + " has " + odd + " days");
        }
        if (month.equals("Aug")){
            System.out.println(month + " " + yearNum + " has " + odd + " days");
        }
        if (month.equals("Sep")){
            System.out.println(month + " " + yearNum + " has " + even + " days");
        }
        if (month.equals("Oct")){
            System.out.println(month + " " + yearNum + " has " + odd + " days");
        }
        if (month.equals("Nov")){
            System.out.println(month + " " + yearNum + " has " + even + " days");
        }
        if (month.equals("Dec")){
            System.out.println(month + " " + yearNum + " has " + odd + " days");
        }
    }
}
