package Multi_Threading;
class MyShutDown extends Thread {
    public void run() {
        System.out.println("Shutdown Hook task is completed...");
    }
}

public class ShutDownEx1 {
    public static void main(String[] args) throws Exception {
        Runtime obj = Runtime.getRuntime();
        obj.addShutdownHook(new MyShutDown());
        System.out.println("Now main is sleeping... to exit press Ctrl+c");
        try {
            Thread.sleep(4000);
        } catch (Exception e) {

        }
    }
}
