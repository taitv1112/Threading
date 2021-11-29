package Thread.Even_Odd_thread;

public class EvenThread extends DemoThread {
    public EvenThread(String threadName) {
        super(threadName);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                try {
                    Thread.sleep(15);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
