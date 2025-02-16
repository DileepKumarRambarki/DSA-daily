class Solution {
    public int search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        int mid=0;
        int pivot=0;
        int n=nums.length;
        if(nums[low]<=nums[high]){
            pivot=0;
            return bsearch(nums,0,n-1,target);
        }
        while(low<high){
            mid=(low+high)/2;
            if(mid<high&& nums[mid]>nums[mid+1]){
                pivot=mid+1;
                break;
            }
            if(low<mid&& nums[mid]< nums[mid-1]){
                pivot=mid;
                break;
            }
            if(nums[mid]<nums[high]){
                high=mid-1;
            }
            else if(nums[mid]>nums[high]){
                low=mid+1;
            }
        }
        if(target>=nums[0]){
            return bsearch(nums,0,pivot-1,target);
        }
        else {
            return bsearch(nums,pivot,n-1,target);
        }
    }
    static int  bsearch(int nums[],int low,int high,int target){
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(target<nums[mid]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }
}