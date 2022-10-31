// This Function traverse given binary tree vertically
class Tuple{
    TreeNode t; int x; int y;
    Tuple(TreeNode t, int x, int y){
        this.t=t;this.x=x; this.y=y;
    }
}
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root==null)
            return res;
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> map=new TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>>();
    
//         y,<x,TreeMap<level, TreeNode>>
//         in the declaration Priority Queue is taken, which will be used 
        // in the case if at same coordinate two or more nodes are colliding
        Queue<Tuple> q=new LinkedList<Tuple>();
        q.offer(new Tuple(root, 0, 0));
        while(!q.isEmpty()){            
                Tuple t=q.poll();
                if(t.t.left!=null) q.offer(new Tuple(t.t.left, t.x+1,t.y-1));
                if(t.t.right!=null) q.offer(new Tuple(t.t.right, t.x+1,t.y+1));
                if(!map.containsKey(t.y)){
                    map.put(t.y, new TreeMap<>());
                }
//                 map.get(t.y).containsKey(t.x)// will return internal TreeMap with y cordinate y and x coodinate x
                if(!map.get(t.y).containsKey(t.x)){
                    map.get(t.y).put(t.x,new PriorityQueue<>());                    
                }
                map.get(t.y).get(t.x).offer(t.t.val);//get TreeMap t of key y, get PriorityQueue pq of key x, add value to pq             

                     
        }// limit of while loop
        for(TreeMap<Integer, PriorityQueue<Integer>> outerMap: map.values()){//will return all inner maps as values
            List<Integer> r=new ArrayList<>();
            for(PriorityQueue<Integer> pq: outerMap.values()){
                while(!pq.isEmpty()){
                    r.add(pq.poll());
                }
            }
            res.add(r);
        }
        return res;
    }
}