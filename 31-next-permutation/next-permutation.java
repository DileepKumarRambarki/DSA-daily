class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int j=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                j=i;
                break;
            }
        }
        if(j==-1){
            Arrays.sort(nums);
            return;
        }
        for(int i=n-1;i>j;i--){
            if(nums[i]>nums[j]){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                break;
            }
        }
        int i=j+1;
        int k=n-1;
        while(i<k){
            int temp=nums[i];
            nums[i]=nums[k];
            nums[k]=temp;
            i++;
            k--;
        }
       
    }
}