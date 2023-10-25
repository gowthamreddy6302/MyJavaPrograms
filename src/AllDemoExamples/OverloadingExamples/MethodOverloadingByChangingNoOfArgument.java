package AllDemoExamples.OverloadingExamples;

class Demo{
    void multiply(int a, int b){
        System.out.println("Result = " + (a*b));
    }
    void multiply(int a, int b, int c){
        System.out.println("Result = " + (a*b*c));
    }
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.multiply(10, 20);
        obj.multiply(10, 20, 30);
    }
}
