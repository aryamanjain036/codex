import java.util.Scanner;

public class q_23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter employee's name: ");
        String name = scan.nextLine();
        System.out.println("Enter number of hours worked in a week: ");
        double hoursWorked = scan.nextDouble();
        System.out.println("Enter hourly pay rate: ");
        double payRate = scan.nextDouble();
        System.out.println("Enter federal tax withholding rate: ");
        double federalTax = scan.nextDouble();
        System.out.println("Enter state withholding rate: ");
        double stateTax = scan.nextDouble();
        double grossPay = payRate*hoursWorked;
        double federalWithholding = federalTax*grossPay;
        double stateWithholding = stateTax*grossPay;
        double deduction = federalWithholding+stateWithholding;
        double finalPay = grossPay-deduction;
        System.out.println("Employee Name: " + name);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Pay Rate: $" + payRate);
        System.out.println("Gross Pay: $" + grossPay);
        System.out.println("Deductions:");
        System.out.println("\tFederal Withholding (" + (federalTax*100) + "%): $" + (int)(federalWithholding*100)/100.0);
        System.out.println("\tState Withholding (" + (stateTax*100) + "%): $" + (int)(stateWithholding*100)/100.0);
        System.out.println("Net pay: $" + (int)(finalPay*100)/100.0);
    }
}
