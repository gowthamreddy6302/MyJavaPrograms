package JavaPrograms.OOPS;

class Srm extends Viswasai {
    Srm(String name, double presentDays, double workingDays, double fees, String studentName, boolean condolation) {
        super(name, presentDays, workingDays, fees, studentName, condolation);
    }

    @Override
    public double calculateAttendence() {
        double percentage = (presentDays / workingDays) * 100;
        if (percentage < 50) {
            condolation = true;
        }   
        return percentage;
    }

    @Override
    public long calculateannualFee() {
        long annualFee = (long) ((fees / 30) * workingDays);
        return annualFee;
    }

    public String convertToIndianRupees(long totalFees) {
        long num = totalFees;
        String str = Long.toString(num);
        char[] ch = str.toCharArray();
        int j = 3;
        int k = 0;
        String str1 = "";
        for(int i = ch.length - 1; i >= 0; i--){
            k++;
            str1 = String.valueOf(ch[i]).concat(str1);
            if(k == j){
                str1 = ",".concat(str1);
                j += 2;
            }
        }
        return str1;
    }
    public void info() {
        System.out.println("--------------------------------STUDENT PERSONAL-DETAILS-----------------------------");
        System.out.println("SCHOOL NAME : " + name);
        System.out.println("STUDENT NAME : " + studentName);
        System.out.println("SCHOOL WORKING DAYS ARE : " + workingDays);
        System.out.println("NUMBER OF DAYS ATTENDED : " + presentDays);
        System.out.println("FEES : " + fees);
        System.out.println("----------------------PERCENTAGE PROFILE---------------------------------------------");
        System.out.println("YOUR ATTENDENCE PERCENTAGE : " + calculateAttendence());
        double condolationCharges = 1500;
        System.out.println("----------------------FEES TO BE PAID-------------------------------------------------");
        if (condolation) {
            long totalFees = (long) (calculateannualFee() + condolationCharges);
            System.out.println("ANNUAL FEES TO BE PAID : " + convertToIndianRupees(totalFees));
        } else {
            System.out.println("ANNUAL FEES TO BE PAID : " + convertToIndianRupees(calculateannualFee()));
        }
    }

    public static void main(String[] args) {  
        Srm obj = new Srm("SRM", 50, 350, 10000,
                "SUBBHA RAIDU", false);
        obj.info();
    }
}
