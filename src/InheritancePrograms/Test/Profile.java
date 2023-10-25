package InheritancePrograms.Test;

class Details {
    String name;
    int age;
    String college;
    int number;

    Details(String name, int age, String college, int number) {
        this.name = name;
        this.age = age;
        this.college = college;
        this.number = number;
    }
   
    public void profiledetails() {
        System.out.println("NAME OF THE PERSON IS = " + name);
        System.out.println("AGE OF THE PERSON = " + age);
        System.out.println("COLLEGE OF THE PERSON = " + college);
        System.out.println("PHONE NUMBER OF THE PERSON IS =" + number);
    }
    
    Details() {

    }
}
 

class Profile extends Details {
    public static void main(String[] args) {
        Details obj = new Details("Gowtham", 25, "Viswasai", 984525302);
        obj.profiledetails();
    }
}
