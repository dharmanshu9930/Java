class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
       List<Integer> ans = new ArrayList<Integer>();
        help(root, ans);
        return ans;
    }
    public void help (TreeNode root, List<Integer>ans)
    {
        if(root!=null)
        {
            help(root.left, ans);
            ans.add(root.val);
            //System.out.print(root.val+ " "+ "ans: "+ ans);
            help(root.right,ans);
            //System.out.print("ans: "+ans);
        }
        
        
    }
}
