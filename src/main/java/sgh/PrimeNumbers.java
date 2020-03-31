package sgh;

public class PrimeNumbers {

    public static void primes(int n) {
        int sum = 0; int a = 0; int b; int c = 1;
        while (a < n) {
            for (b = 1; b <= c; b++) {
                if (c % b == 0) {
                    sum = sum + 1;
                }
            }
            if (sum == 2) {
                a = a + 1;
                if (a < n) {
                    System.out.print(c + ", ");
                } else {
                    System.out.print(c + "\n");
                }
            }
            c ++;
            sum = 0;
        }
       
    }

    public static void main(String[] args) {
        primes(4);
    }
}
