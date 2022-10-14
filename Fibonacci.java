public class Fibonacci {
    int ar[] = new int[41];

    public int fib(int n) {
        if (ar[n] != 0) {
            return ar[n];
        } else if (n <= 1) {
            return 1;
        }
        ar[n] = fib(n - 1) + fib(n - 2);
        return ar[n];
    }

    public static void main(String[] args) {
        Fibonacci a = new Fibonacci();
        System.out.println("The Fib of 40: " + a.fib(40));
    }
}
