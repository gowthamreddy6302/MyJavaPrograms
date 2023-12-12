package Multi_Threading;

public class Ex1 {
        public static void main(String[] args) {
            Thread t = Thread.currentThread();
            t.setName("Saif");
            System.out.println("Thread name is : " + t);
        }
    }
