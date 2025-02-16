class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                int first=mid;
                int last=mid;
                while(first>0&& nums[first]==nums[first-1]){
                    first--;
                }
                while(last<nums.length-1&& nums[last]==nums[last+1]){
                    last++;
                }
                return new int[]{first,last};
            }
            else if(target<=nums[mid]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return new int[]{-1,-1};
    }
}