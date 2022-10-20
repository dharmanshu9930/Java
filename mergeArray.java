class Solution {
    public void mergeArray(int[] nums1, int m, int[] nums2, int n) {
       for (int a= m; a<m+n; a++){
           nums1[a] = nums2[a-m];
       }
      Arrays.sort(nums1);   
    }
}
