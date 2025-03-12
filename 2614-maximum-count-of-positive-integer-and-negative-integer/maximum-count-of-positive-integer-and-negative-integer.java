class Solution {
    public int maximumCount(int[] nums) {
        int low=0;
        int high=nums.length-1;
        int pos=-1;
        int count=0;
        if(nums[0]==0&&nums[high]==0) return 0;
        while(low<=high && high<nums.length&&low>=0){
            int mid=(low+high)/2;
            if(nums[mid]>0){
                pos=mid;
                high=mid-1;
            }
            else if(nums[mid]<0){
                low=mid+1;
            }
            else{
                count++;
                low=mid+1;
            }
        }
        low=0;
        high=nums.length-1;
        int neg=-1;
        while(low<=high && high<nums.length&&low>=0){
            int mid=(low+high)/2;
            if(nums[mid]<0){
                neg=mid;
                low=mid+1;
            }
            else if(nums[mid]>0){
                high=mid-1;
            }
            else{
                count++;
                high=mid-1;
            }
        }
        if(neg>=0&&pos>=0){
        return Math.max(nums.length-pos,neg+1);
        }
        else if(pos>=0){
            return nums.length-pos;
        }
        return neg+1;
    }
}