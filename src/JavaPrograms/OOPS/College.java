package JavaPrograms.OOPS;

class Viswasai extends School {
    String studentName;
    boolean condolation;

    Viswasai(String name, double presentDays, double workingDays, double fees, String studentName,
            boolean condolation) {
        super(name, presentDays, workingDays, fees);
        this.studentName = studentName;
    }

    @Override
    public double calculateAttendence() {
        double percentage = (presentDays / workingDays) * 100;
        if (percentage < 60) {
            condolation = true;
        }
        return percentage;
    }

    @Override
    public long calculateannualFee() {
        long annualFee = (long) (fees * 12);
        System.out.println("THE ANNUAL FEES = " + annualFee);
        return annualFee;
    }

    public void info() {
        System.out.println(
                "--------------------------------STUDENT PERSONAL-DETAILS-------------------------------------");
        System.out.println("SCHOOL NAME : " + name);
        System.out.println("STUDENT NAME : " + studentName);
        System.out.println("SCHOOL WORKING DAYS ARE : " + workingDays);
        System.out.println("NUMBER OF DAYS ATTENDED : " + presentDays);
        System.out.println("YOUR ATTENDENCE PERCENTAGE : " + calculateAttendence());
        double condolationCharges = 30000;
        if (condolation) {
            long totalFees = (long) (calculateannualFee() + condolationCharges);
            System.out.println("ANNUAL FEES TO BE PAID : " + totalFees);
        } else {
            System.out.println("ANNUAL FEES TO BE PAID : " + calculateannualFee());
        }
    }

    public static void main(String[] args) {
        Viswasai obj = new Viswasai("VISWASAi", 200, 365, 2000000, "GOWTHAM", false);
        obj.info();
    }
}