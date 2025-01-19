package Threading;

public class Test1 extends Thread {
    public void run() {
        testing("Extended thread");
    }

    public void testing(String str) {
        System.out.println("Testing ...\n" + "\t" + str);
    }
}
