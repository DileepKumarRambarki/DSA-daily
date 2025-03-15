class Solution {
    public int minCapability(int[] nums, int k) {
        int n=nums.length;
        if(n<k*2-1) return 0;
        int low=Integer.MAX_VALUE;
        int high=0;
        int res=Integer.MAX_VALUE;
        for(int i:nums){
            if(i<low){
                low=i;
            }
            if(i>high){
                high=i;
            }
        }
        while(low<=high){
            int mid=(low+high)/2;
            boolean rob=isRob(nums,mid,k);
            if(rob){
                high=mid-1;
                res=Math.min(res,mid);
            }
            else{
                low=mid+1;
            }
        }
        return res;
    }
    boolean isRob(int nums[],int cap,int k){
        int count=0;
        int prev=-2;
        for(int i=0;i<nums.length;i++){
            if(i-1!=prev&&nums[i]<=cap){
                count++;
                prev=i;
            }
            if(count==k) return true;
        }
        return false;
    }
}