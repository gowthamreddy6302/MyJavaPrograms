package AllDemoExamples.OverRidingExamples;

class Animals {
    Animals getobj() {
        System.out.println("Animal is object");

        return new Animals();
    }
}

class Dog extends Animals {
    Dog getobj() {
        System.out.println("Dog is a object");

        return new Dog();
    }

    public static void main(String[] args) {
        new Dog().getobj();
    }
}
