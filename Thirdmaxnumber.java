class Thirdmaxnumber {
    public int thirdMax(int[] nums) {
        Set<Integer> ls= new HashSet<Integer>();
        for(Integer in: nums)
            ls.add(in);
          
        if(ls.size()==1) return nums[0];
        if(ls.size()==2) return Collections.max(ls);
        ls.remove(Collections.max(ls));
        ls.remove(Collections.max(ls));
        return Collections.max(ls);
        
    }
}
