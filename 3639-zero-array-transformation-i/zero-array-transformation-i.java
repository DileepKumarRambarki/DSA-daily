class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int arr[]=new int[nums.length+1];
        int n=nums.length;
        for(int i=0;i<queries.length;i++){
            int left=queries[i][0];
            int right=queries[i][1];
            arr[left]=arr[left]+1;
            if(right+1<n) arr[right+1]=arr[right+1]-1;
        }
        int sub=0;
        for(int i=0;i<n;i++){
                sub+=arr[i];
                nums[i]-=sub;
        }
        for(int i:nums){
            System.out.print(i+" ");
            if(i>0) return false;
        }
        return true;
    }
}