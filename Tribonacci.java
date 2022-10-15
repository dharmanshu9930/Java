

public class Tribonacci {
    int ar[] = new int[38];

    public int tribonacci(int n) {
        if (n <= 2) {
            return n == 2 ? 1 : n;
        } else if (ar[n] != 0) {
            return ar[n];
        } else {
            ar[n] = tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
            return ar[n];
        }
    }

    public static void main(String[] args) {
        Tribonacci a = new Tribonacci();
        System.out.println("tribonacci(4) :" + a.tribonacci(4));
    }
}
