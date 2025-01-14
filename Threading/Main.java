package Threading;

public class Main {
    public static void main(String[] args) {
        System.out.println("Am running on the main thread");
        sec();
        first();
    }

    public static void first() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Am running on a first sub thread");
            }
        });
        thread.run();
    }

    public static void sec() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        Thread.sleep(1000);
                    }catch (Exception e){
                        System.out.println(e.getStackTrace());
                    }finally {

                    }
                    System.out.println("Am running on a second sub thread");
                }
            }
        });

        thread.start();

    }
}
