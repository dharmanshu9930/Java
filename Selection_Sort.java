package lec_12;

import java.util.Arrays;

public class Selection_Sort {

	public static void main(String[] args) {
		int[] arr = { 50, 40, 30, 20, 10 };
		selection(arr);
	}

	public static void selection(int[] arr) {
		int last = arr.length - 1;
		while (last > 0) {

			int max_idx = 0;
			for (int i = 0; i <= last; i++) {
				if (arr[i] > arr[max_idx]) {
					max_idx = i;
				}
			}
			System.out.println(max_idx + " Swapping " + last);
			int temp = arr[max_idx];
			arr[max_idx] = arr[last];
			arr[last] = temp;
			last--;
			System.out.println(Arrays.toString(arr));
			System.out.println("******************************");
		}
	}

}
