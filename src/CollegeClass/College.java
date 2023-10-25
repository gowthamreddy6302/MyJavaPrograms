package CollegeClass;

public class College {
    String collegename;
    String name;
    String address;
    String branches;
    College(String collegename, String name, String address, String branches){
        this.collegename = collegename;
        this.name = name;
        this.address = address;
        this.branches = branches;
    }
    public void Details(){
        System.out.println("NAME OF THE COLLEGE = " + collegename);
        System.out.println("PERSON NAME = " + name);
        System.out.println("ADDRESS OF THE PERSON = " + address);
        System.out.println("NAME OF BRANCH = " + branches);
    }
}
