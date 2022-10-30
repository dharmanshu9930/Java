class Subarraysumequalsk {
    public int subarraySum(int[] nums, int k) {
        
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        int sum = 0;
        map.put(0, 1);
        int count = 0;
        
        for(int i = 0; i < nums.length; i++)
        {
            int num = nums[i];
            sum += num;
            
            int val = sum - k;
            if(map.containsKey(val))
            {
                count += map.get(val);                
            }
            map.put(sum,map.getOrDefault(sum, 0) + 1); 
        }
     return count;   
    }
}
