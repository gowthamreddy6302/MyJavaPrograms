package InheritancePrograms.Test;

import InheritancePrograms.DefaultAccessModDemo;

public class DefaultAccessModTest {
    public static void main(String[] args) {
        DefaultAccessModDemo obj = new DefaultAccessModDemo();
        // By calling default access modifier method show(),
        //  we will get an error because its not visible to this class
        // It's Outside the class.
        // obj.show(); 
    }
}
