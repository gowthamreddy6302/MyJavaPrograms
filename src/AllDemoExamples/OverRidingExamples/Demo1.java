package AllDemoExamples.OverRidingExamples;

class Animal {
    public void eat() {
        System.out.println("Eat all vegitables");
    }
}
// The method access modifiers should be same in both classes.
class Rabbit extends Animal {
    public void eat() {
        System.out.println("Eat carrots");
    }

    public static void main(String[] args) {
        Rabbit obj = new Rabbit();
        obj.eat();
    }
}
