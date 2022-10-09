
// Using Sieve method

import java.util.Scanner;
import java.util.Arrays;
class PrimeNumbers {
	private static Integer sieve(Integer n) {
		if (n <= 1) return 0;
		Boolean[] arr = new Boolean[n+1];
		Arrays.fill(arr, true);

		Integer cnt = 0;
		for (Integer i=2; i<=n; i++) {
			if (arr[i] == true) {
				cnt++;
				System.out.println(i);
				for (Integer j=2*i; j<=n; j+=i) {
					arr[j] = false;
				}
			}
		}
		return cnt;
	}

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		Integer n = inp.nextInt();

		System.out.println();
		Integer cnt = sieve(n);
		System.out.print("Total Prime Numbers: ");
		System.out.println(cnt);
		inp.close();
	}
}
