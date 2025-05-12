class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> l=new ArrayList<>();
        rec(0,l,res,nums);
        return res; 
    }
    void rec(int ind,List<Integer> l,List<List<Integer>> res,int[] nums){
        if(ind==nums.length){
            List<Integer> t=new ArrayList<>(l);
            Collections.sort(t);
            if(res.contains(t)) return;
            res.add(t);
            // System.out.println("ind: "+ind+" l: "+l+"  res: "+res);
            return ;
        }
        l.add(nums[ind]);
        rec(ind+1,l,res,nums);
        l.remove(l.size()-1);
        rec(ind+1,l,res,nums);

    }
}