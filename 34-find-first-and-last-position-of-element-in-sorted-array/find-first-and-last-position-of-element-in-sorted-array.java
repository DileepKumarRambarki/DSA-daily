class Solution {
    public int[] searchRange(int[] nums, int target) {
        int res[]=new int[2];
        res[0]=bs(nums,target,true);
        res[1]=bs(nums,target,false);
        return res;
    }
    static int bs(int nums[],int target,boolean left){
        int index=-1;
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                index=mid;
                if(left){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else if(target<=nums[mid]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return index;
    }
}