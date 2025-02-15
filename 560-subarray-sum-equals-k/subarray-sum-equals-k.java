class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,1);
        int count=0;
        int sum=0;
        for(int i:nums){
            sum+=i;
            if(hm.containsKey(sum-k)){
                count+=hm.get(sum-k);
            }
                if(hm.containsKey(sum)){
                    hm.put(sum,hm.get(sum)+1);
                }
                else{
                    hm.put(sum,1);
                }
        }
        return count;
    }
}