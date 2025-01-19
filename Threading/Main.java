package Threading;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Am running on the main thread");
        sec();
        first();

        /* Starting a thread on a class that extends Thread */
        Test1 test = new Test1();
        try {
            test.sleep(8000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        test.start();

        /* Starting a thread on a class that implements Runnable interface */
        Test2 test2 = new Test2();
        Thread thread = new Thread(test2);
        thread.start();

    }

    public static void first() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("\tAm running on a first sub thread");
            }
        });
        thread.run();
    }

    public static void sec() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    try {
                        Thread.sleep(1000);
                    }catch (Exception e){
                        System.out.println(e.getStackTrace());
                    }finally {
                        try {
                            Thread.sleep(4000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println("Its done!");
                    }
                    System.out.println("\tAm running on a second sub thread\n");
                }
//                thread.isAlive();
            }
        });

        thread.start();

    }
}
























