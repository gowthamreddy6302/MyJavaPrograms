package JavaPrograms.OOPS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class September extends August {

    public September(String name, int salary, int costs, String companyName) {
        super(name, salary, costs, companyName);
    }
    public September() {}
    public static void main(String[] args) {
        September month = new September();
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER COMPANY NAME : ");
        String office = sc.nextLine();
        System.out.print("ENTER THE MONTH : ");
        String mname = sc.nextLine();
        System.out.print("ENTRY SALARY : ");
        int amount = sc.nextInt();
        System.out.print("ENTER THE EXPENDITURE : ");
        int cost = sc.nextInt();
        month.setName(mname);
        month.setSalary(amount);
        month.setCosts(cost);
        month.setCompanyName(office);
        month.getMonthlyPayslip(month);
        month.monthlySavings(amount, cost);
        

    }
}
