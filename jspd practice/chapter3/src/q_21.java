import java.util.Scanner;

public class q_21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter year : ");
        int year = scan.nextInt();
        System.out.println("Enter month : ");
        int m_month = scan.nextInt();
        System.out.println("Enter the day of the month : ");
        int q_dayOfMonth = scan.nextInt();
        if (m_month == 1){
            m_month = 13;
            year -= 1;
        }
        else if (m_month == 2){
            m_month = 14;
            year -= 1;
        }
        int j_century = year/100;
        int k_yearCentury = year%100;
        int h = (q_dayOfMonth + ((26*(m_month+1))/10) + k_yearCentury + (int)(k_yearCentury/4) + (int)(j_century/4) + (5*j_century))%7;
        switch (h){
            case 0:
                System.out.println("Day of the week is Saturday");
                break;
            case 1:
                System.out.println("Day of the week is Sunday");
                break;
            case 2:
                System.out.println("Day of the week is Monday");
                break;
            case 3:
                System.out.println("Day of the week is Tuesday");
                break;
            case 4:
                System.out.println("Day of the week is Wednesday");
                break;
            case 5:
                System.out.println("Day of the week is Thursday");
                break;
            case 6:
                System.out.println("Day of the week is Friday");
                break;
        }
    }
}
