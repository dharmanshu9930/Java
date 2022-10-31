class Sortcolour {
    public void sortColors(int[] nums) {
        int i =0;
        int j = nums.length-1;
        int k =j;
        while(i<=j){
            int curr = nums[j];
            if(curr==0)
                swap(nums, i++, j);
            else if(curr==2){
                swap(nums,j--, k--);
            }else
                j--;
        }
    }
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
      
        nums[j] = temp;
    }
}
