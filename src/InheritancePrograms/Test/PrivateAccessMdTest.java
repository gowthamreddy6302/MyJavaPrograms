package InheritancePrograms.Test;

public class PrivateAccessMdTest {
    public static void main(String[] args) {
        PrivateAccessMdTest demo = new PrivateAccessMdTest();
        // Can't access the private class in any classes and not possible for inheritance.
        demo.no(); // compile error
      }
}
