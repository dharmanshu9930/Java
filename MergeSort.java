

public class MergeSort {
    int q[];

    public void Merge(int start, int mid, int end) {
        int n1 = mid - start + 1;
        int n2 = end - mid;
        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = q[start + i];
        for (int j = 0; j < n2; ++j)
            R[j] = q[mid + 1 + j];

        int i = 0, j = 0;

        int k = start;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                q[k] = L[i];
                i++;
            } else {
                q[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            q[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            q[k] = R[j];
            j++;
            k++;
        }
    }

    public void Mergesort(int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            Mergesort(0, mid);
            Mergesort(mid + 1, end);
            Merge(start, mid, end);
        }
    }

    public int[] sortArray(int[] nums) {
        q = nums;
        Mergesort(0, nums.length - 1);
        return q;
    }

    public static void main(String[] args) {
        MergeSort a = new MergeSort();
        int ar[] = { 123, 132, 90, 2 };
        System.out.println("Before Sorting");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println();
        ar = a.sortArray(ar);
        System.out.println("After Sorting");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
    }
}
