class Solution {
    public boolean divideArray(int[] nums) {
        // Arrays.sort(nums);
        // for(int i=1;i<nums.length;i+=2){
        //     if(nums[i]!=nums[i-1]){
        //         return false;
        //     }
        // }
        // return true;
        int freq[]=new int[501];
        for(int i:nums){
            freq[i]++;
        }
        for(int i=1;i<501;i++){
            if(freq[i]%2==1){
                return false;
            }
        }
        return true;
    }
}