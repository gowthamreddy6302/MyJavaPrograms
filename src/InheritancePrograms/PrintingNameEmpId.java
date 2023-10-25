package InheritancePrograms;

class Person {
    String firstname;
    String lastname;

    Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }
    Person() {

    }
}

class EmployeeId extends Person {
    int employeeid;
    String jobrole;

    EmployeeId(String firstname, String lastname, int employeeId, String jobrole) {
        super(firstname, lastname);
        this.employeeid = employeeId;
        this.jobrole = jobrole;
    }

    public int getEmployeeid() {
        return employeeid;
    }

    public String getlastname() {
        return lastname;

    }

    public String getJobrole() {
        return jobrole;
    }

    public static void main(String[] args) {
        EmployeeId obj = new EmployeeId("junior", "philipa", 84334, "Software devloper");
        System.out.println("FIRST NAME = " + obj.firstname);
        System.out.println("ENTER LASTNAME = " + obj.lastname);
        System.out.println("ENTER THE EMPLOYEE ID = " + obj.employeeid);
        System.out.println("ENTER THE JOB ROLE = " + obj.jobrole);
    }
}