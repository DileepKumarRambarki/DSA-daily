class Solution {
    public int findLHS(int[] nums) {
        // HashMap<Integer,Integer> hm=new HashMap<>();
        // for(int i:nums){
        //     hm.put(i,hm.getOrDefault(i,0)+1);
        // }
        // int res=0;
        // for(int i:hm.keySet()){
        //     if(hm.containsKey(i-1)){
        //         res=Math.max(res,hm.get(i)+hm.get(i-1));
        //     }
        //     if(hm.containsKey(i+1)){
        //         res=Math.max(res,hm.get(i)+hm.get(i+1));
        //     }
        // }
        // return res;
        Arrays.sort(nums);
        int l=0,r=1,res=0;
        while(r<nums.length){
            if(nums[r]-nums[l]==1){
                res=Math.max(res,r-l+1);
                r++;
            }
            else if(nums[r]-nums[l]>1){
                l++;
            }
            else{
                r++;
            }
        }
        return res;
    }
}