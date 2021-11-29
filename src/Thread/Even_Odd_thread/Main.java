package Thread.Even_Odd_thread;

public class Main {
    public static void main(String[] args) {
        OddThread t = new OddThread("thread1");
        EvenThread t1 = new EvenThread("thread2");
        EvenThread t2 = new EvenThread("thread3");
        EvenThread t3 = new EvenThread("thread3");
        EvenThread t4 = new EvenThread("thread3");
        EvenThread t5 = new EvenThread("thread3");
        t1.start();
        try {
            t1.join(5000);
        } catch (Exception e) {
            System.out.println(e);
        }
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t.start();


    }

}
