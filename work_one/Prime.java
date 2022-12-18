package work_one;

/**
 * @author Zhang Jinming
 * &#064;date  5/9/2022 上午9:08
 */
public class Prime {
    public void countPrimes(int n) {
        int cnt = 2;
        System.out.print(2 + " " + 3 + " ");
        int num = 6;
        while (num < n) {
            if (isPrime(num - 1)) {
                cnt++;
                System.out.print(num - 1 + " ");
            }
            if (cnt == 5) {
                System.out.println();
                cnt = 0;
            }
            if (isPrime(num + 1)) {
                cnt++;
                System.out.print(num + 1 + " ");
            }
            if (cnt == 5) {
                System.out.println();
                cnt = 0;
            }
            num += 6;
        }
    }

    private boolean isPrime(int num) {
        int max = (int) Math.sqrt(num);
        for (int i = 2; i <= max; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        new Prime().countPrimes(20000);
    }
}
