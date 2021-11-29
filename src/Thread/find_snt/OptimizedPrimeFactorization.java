package Thread.find_snt;

public class OptimizedPrimeFactorization implements Runnable{
    @Override
    public void run() {
        for (int i = 2; i < 100; i++) {
            if(checkPrime(i)){
                System.out.println(i+" ");
            }
        }
    }
    public boolean checkPrime(int n){
        for (int i = 2; i < Math.sqrt(n); i++) {
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}
