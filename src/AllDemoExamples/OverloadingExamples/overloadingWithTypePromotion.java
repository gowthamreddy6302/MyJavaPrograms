package AllDemoExamples.OverloadingExamples;

class Demo1{
    void sum(int a, long b){
        System.out.println("Num1 = " +a);
        System.out.println("Name = " +b);
    }
    void sum(int a, int b, int c){
        System.out.println("Sum = " + (a+b+c));
    }
    public static void main(String[] args) {
        Demo1 obj = new Demo1();
        obj.sum(5, 10);
        obj.sum(5,4,3);
    }
}
