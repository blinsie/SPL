package task10;

import java.util.Arrays;

public class Eratosphen {

    boolean[] primes;

    public Eratosphen(int n) {
        primes = new boolean[n+1];
    }

    public void fillSieve() {
        Arrays.fill(primes, true);
        primes[0] = false;
        primes[1] = false;
        for (int i = 2; i < primes.length; ++i) {
            if (primes[i]) {
                for (int j = 2; i * j < primes.length; ++j) {
                    primes[i * j] = false;
                }
            }
        }
    }

    private void printPrimes(boolean[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i])
                System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Eratosphen e = new Eratosphen(100);
        e.fillSieve();
        e.printPrimes(e.primes);
    }
}
