class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        int count=1;
        int max=1;
        int n=nums.length;
        for(int i=0;i<n;i++){
            hm.put(nums[i],i);
        }
        for(int i:hm.keySet()){
            count=1;
            if(!hm.containsKey(i-1)){
                int j=i+1;
                while(hm.containsKey(j)){
                    count++;
                    j++;
                }
            }
            max=Math.max(max,count);
        }
        return max;
    }
}