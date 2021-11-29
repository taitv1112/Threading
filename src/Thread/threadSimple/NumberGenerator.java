package Thread.threadSimple;

public class NumberGenerator implements Runnable{
    public  Thread t;
    int thread;
    private final  String threadName;

    public NumberGenerator(String threadName, int thread) {
        this.thread= thread;
        this.threadName = threadName;
        System.out.println("Creating " + threadName);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(i);
                Thread.sleep(500);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void start(){
        System.out.println("Starting "+threadName);
        if(t == null){
            t = new Thread(this,threadName);
            t.start();
        }
    }

    public static void main(String[] args) {
        NumberGenerator numberGenerator1 = new NumberGenerator("theard1",Thread.MIN_PRIORITY);
        numberGenerator1.start();

        NumberGenerator numberGenerator2 = new NumberGenerator("theard2",Thread.MAX_PRIORITY);

        numberGenerator2.start();
    }
}
