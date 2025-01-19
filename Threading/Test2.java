package Threading;

import static java.lang.Thread.sleep;

public class Test2 implements Runnable {
    @Override
    public void run() {
        testing();
    }

    public void testing() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Testing ... " + "\n\tImplemented runnable interface");
    }
}
