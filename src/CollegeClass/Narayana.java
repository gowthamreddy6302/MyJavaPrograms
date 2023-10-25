package CollegeClass;

class Narayana extends College {
    int collegeId;
    String professer;
    Narayana(String collegename, String name, String address, String branches, int collegeId, String professer) {
        super(collegename, name, address, branches);
        this.collegeId = collegeId;
        this.professer = professer;
    }
    @Override
    public void Details() {
        System.out.println("COLLEGE NAME = " + collegename);
        System.out.println("COLLEGE ID = " + collegeId);
        System.out.println("PROFESSOR NAME = " + professer);
        System.out.println("NAME OF THE STUDENT = " + name);
        System.out.println("ADDRESS FOR A STUDENT = " + address);
        System.out.println("NAME OF THE BRANCH YOU WANT TO JOIN = " + branches);
    }
    public static void main(String[] args) {
        Narayana obj = new Narayana("Narayana", "Gowtham", "Nellore", "C.S.E", 1700105, "Hari Krishna");
        obj.Details();
    }
}
