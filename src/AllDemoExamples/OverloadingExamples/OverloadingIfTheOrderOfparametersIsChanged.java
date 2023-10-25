package AllDemoExamples.OverloadingExamples;

class Demo2{
    void sum(String Name, int Id){
        System.out.println("Company Name = " + Name);
        System.out.println("Company id = " + Id);
    }
    void sum(int Id, String Name){
        System.out.println("Company Name = " + Name);
        System.out.println("Company id = " +Id);
    }
    public static void main(String[] args) {
        Demo2 obj = new Demo2();
        obj.sum("Nexzara", 765235);
        obj.sum("Nexzara", 72783);
    }
}