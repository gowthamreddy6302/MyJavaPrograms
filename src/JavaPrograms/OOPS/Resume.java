package JavaPrograms.OOPS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Resume {

    String name;
    String emailId;
    Long mobileNo;
    String collegeName;
    String address;
    int passedOutYear;
    List<String> skills;
    List<String> hobbies;

    public Resume(String name, String emailId, Long mobileNo,
                  String collegeName, String address, int passedOutYear,
                  List<String> skills, List<String> hobbies) {
        this.name = name;
        this.emailId = emailId;
        this.mobileNo = mobileNo;
        this.collegeName = collegeName;
        this.address = address;
        this.passedOutYear = passedOutYear;
        this.skills = skills;
        this.hobbies = hobbies;
    }

    public Resume() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public Long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(Long mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPassedOutYear() {
        return passedOutYear;
    }

    public void setPassedOutYear(int passedOutYear) {
        this.passedOutYear = passedOutYear;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public void resumeDetails(Resume resume) {
        System.out.print("Name : " + resume.getName());
        System.out.println("Skills : ");
        for (int i=1;i<=resume.getSkills().size();i++){
            System.out.print(i + "." + resume.getSkills().get(i-1));
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your name :");
        String name = sc.nextLine();
        System.out.print("Enter Your Email id : ");
        String emailId = sc.nextLine();
        System.out.print("Enter your mobile no : ");
        Long mobileNo = sc.nextLong();
        sc.nextLine();
        System.out.print("Enter your college name : ");
        String collegeName = sc.nextLine();
        System.out.print("Enter your address : ");
        String address = sc.nextLine();
        System.out.print("Enter your passed out year :");
        int passedOutYear = sc.nextInt();
        System.out.print("Number of Skills : ");
        int num = sc.nextInt();
        sc.nextLine();
        List<String> skills = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            System.out.println("Enter your skills " + i + ":");
            String s1 = sc.nextLine();
            skills.add(s1);
        }
        System.out.print("Number of Hobbies : ");
        int num2 = sc.nextInt();
        sc.nextLine();
        List<String> hobbies = new ArrayList<>();
        for (int i = 1; i <= num2; i++) {
            System.out.println("Enter your hobbie " + i + " : ");
            String s2 = sc.nextLine();
            hobbies.add(s2);
        }
        Resume resume = new Resume(name, emailId, mobileNo,
                collegeName, address, passedOutYear, skills, hobbies);
        resume.resumeDetails(resume);
    }
}
