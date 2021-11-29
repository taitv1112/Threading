package Thread.Even_Odd_thread;

public class DemoThread extends Thread implements Runnable{
    private Thread t;
    private final  String threadName;

    public DemoThread(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {

    }
    public void start(){
        System.out.println("Starting "+threadName);
        if(t == null){
            t = new Thread(this,threadName);
            t.start();
        }
    }
}
