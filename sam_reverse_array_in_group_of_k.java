package today_prac;

import java.util.Arrays;

public class reverse_array_in_group_of_k {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int k = 3;
		reverse_in_group(arr, k);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void reverse_in_group(int[] arr, int k) {
		int i =0;
		int n = arr.length-1;
		while(i < n) {
			if(i+k < n) {
				reverse(arr, i, i+k);
				i += k;
			}else {
				reverse(arr, i, n);
				i += k;
			}
		}
	}
	public static void reverse(int[] arr, int s, int e){
		while(s<e) {
			int temp = arr[s];
			arr[s] = arr[e];
			arr[e] = temp;
			s++;
			e--;
		}
	}

}
