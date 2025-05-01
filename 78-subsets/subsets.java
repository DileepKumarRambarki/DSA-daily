class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        // recursive solution
        // List<List<Integer>> res=new ArrayList<>();
        // for(int i=0;i<nums.length;i++){
        //     List<Integer> l=new ArrayList<>();
        //     l.add(nums[i]);
        //     res.add(l);
        //     merge(l,res,nums,i);
        // }
        // res.add(new ArrayList<>());
        // return res;

        // bit wise manuplation
        List<List<Integer>> res=new ArrayList<>();
        int n=(int)Math.pow(2,nums.length);
        for(int i=0;i<n;i++){
            List<Integer> l=new ArrayList<>();
            int temp=i;
            for(int j=0;j<nums.length;j++){
                if((temp&1)==1){
                    l.add(nums[j]);
                }
                temp=temp>>1;
            }
            res.add(l);
        }
        return res;
    }
    // void merge(List<Integer> l, List<List<Integer>> res,int nums[],int right){
    //     if(right>=nums.length) return;
    //     for(int i=right+1;i<nums.length;i++){
    //         List<Integer> temp=new ArrayList<>(l);
    //         temp.add(nums[i]);
    //         res.add(temp);
    //         merge(temp,res,nums,i);
    //     }
    // }
}