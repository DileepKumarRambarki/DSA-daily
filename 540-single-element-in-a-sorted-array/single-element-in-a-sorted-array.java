class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length==1) return nums[0];
        int low=0;
        int high=nums.length-1;
        int res=-1;
        while(low<=high){
            int mid=(low+high)/2;
            int mid1=-1,mid2=-1;
            if(low<mid&&nums[mid]==nums[mid-1]){
                mid1=mid-1;
                mid2=mid;
            }
            else if(mid<high&&nums[mid]==nums[mid+1]){
                mid1=mid;
                mid2=mid+1;
            }
            else{
                res=mid;
                break;
            }
            if((high-mid2)%2==1){
                low=mid2+1;
            }
            else{
                high=mid1-1;
            }
        }
        return nums[res];
    }
}