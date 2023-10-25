package JavaPrograms.OOPS;

class School {
    String name;
    double presentDays;
    double workingDays;
    double fees;

    School(String name, double presentDays, double workingDays, double fees) {
        this.name = name;
        this.presentDays = presentDays;
        this.workingDays = workingDays;
        this.fees = fees;
    }

    public double getdaysPresent() {
        return presentDays;
    }

    public double getworkingDays() {
        return workingDays;
    }

    public double getanualFees() {
        return fees;
    }

    public double calculateAttendence() {
        double percentage = (presentDays / workingDays) * 100;
        return percentage;
    }

    public long calculateannualFee() {
        long annualFee = (long) (fees * 12);
        return annualFee;
    }
}
