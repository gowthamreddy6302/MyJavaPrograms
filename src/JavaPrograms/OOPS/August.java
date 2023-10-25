package JavaPrograms.OOPS;

public class August extends Month {

    boolean savings = true;

    public August(String name, int salary, int costs, String companyName) {
        super(name, salary, costs, companyName);
    }
    public August (){
        
    }

    @Override
    public void getMonthlyPayslip(August obj) {
        System.out.println("NAME OF THE MONTH : " + obj.getName());
        System.out.println("SALARY OF THE PERSON : " + obj.getSalary());
        System.out.println("AMOUNT OF MONEY SPENT : " + obj.getCosts());
        System.out.println("COMPANY NAME : " + obj.getCompanyName());
    }

    @Override
    public int monthlySavings(int salary, int costs) {
        System.out.println("Your monthly savings are : " + calculateSavings(salary, costs));
        if (!this.savings) {
            System.out.println("YOUR SAVINGS ARE BAD ");
        } else {
            System.out.println("YOURE SAVINGS ARE GOOD ");
        }
        return salary;
    }

    @Override
    public int calculateSavings(int salary, int costs) {
        int calculateSavings = (salary - costs);
        if (calculateSavings <= costs) {
            this.savings = false;
        }
        return calculateSavings;
    }

    public static void main(String[] args) {
        August obj = new August("August", 50000, 45000, "TCS");
        obj.getMonthlyPayslip(obj);
        obj.monthlySavings(obj.getSalary(), obj.getCosts());
        

    }
}
