package Thread.find_snt;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new LazyPrimeFactorization());

        Thread t2 = new Thread(new OptimizedPrimeFactorization());
        t1.start();
        t2.start();
    }
}
