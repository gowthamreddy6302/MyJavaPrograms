package AllDemoExamples.OverloadingExamples;

class Calculate {
    void sum(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }

    void sum(float a, float b) {
        System.out.println("Sum = " + (a + b));
    }

    public static void main(String[] args) {
        Calculate obj = new Calculate();
        obj.sum(5, 10);
        obj.sum(4.6f, 3.6f);
    }
}
