class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int sum=0;
        for(int i:weights){
            sum+=i;
        }
        int low=1,high=sum;
        int res=0;
        while(low<=high){
            int mid=(low+high)/2;
            int d=days(weights,mid);
            if(d==0){
                low=mid+1;
            }
            else if(d<=days){
                res=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return res;
    }
    static int days(int nums[],int cap){
        int days=0;
        int i=0;
        int temp=0;
        while(i<nums.length){
            if(nums[i]>cap) return 0;
            temp+=nums[i];
            if(temp>cap){
                days++;
                temp=0;
            }
            else{
                i++;
            }
        }
        if(temp>0){
            days++;
        }
        return days;
    }
}