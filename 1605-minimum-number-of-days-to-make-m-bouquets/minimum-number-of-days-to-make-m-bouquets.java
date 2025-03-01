class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        if(n<m*k) return -1;
        int max=-1;
        for(int i:bloomDay){
            if(i>max){
                max=i;
            }
        }
        int res=-1;
        int low=1;
        int high=max;
        while(low<=high){
            int mid=(low+high)/2;
            int boq=boq(bloomDay,k,mid);
            if(boq>=m){
                res=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return res;
    }
    static int boq(int nums[],int k,int days){
        int n=nums.length;
        int i=0;
        int adj=0;
        int m=0;
        while(i<n){
            if(nums[i]<=days){
                adj++;
            }
            else{
                m+=adj/k;
                adj=0;
            }
            i++;
        }
        m+=adj/k;
        return m;
    }
}