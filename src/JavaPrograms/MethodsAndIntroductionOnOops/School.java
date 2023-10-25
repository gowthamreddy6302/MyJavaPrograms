package JavaPrograms.MethodsAndIntroductionOnOops;

public class School {
    public String studentName(String name){
        String resultString = "Hi ".concat(name);
        return resultString;
    }

    public void studentMarks(int marks, String name){
        String greetingMessage = studentName(name);
        System.out.println(greetingMessage.concat(" Your marks are " + marks));
    }
}
