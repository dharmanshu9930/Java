public class sortedarray {
    // we have to sort array at right position first (n-1) elements are sorted in
    // ascending order
    // array = {10,30,32,34,37,41,33}
    // output = {10,20,32,33,34,37,41}
    // step1 = finding the position step2 =shifting
    sortedarray(int arr[], int n) {
        int pos = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                pos = i;
                break;
            }
        }
        int temp = arr[n - 1];
        for (int i = 0; i > pos; i--) {
            arr[i] = arr[i - 1];
        }
        arr[pos] = temp;

    }
}
