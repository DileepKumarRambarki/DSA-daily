class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> low=new ArrayList<>();
        List<Integer> high=new ArrayList<>();
        int k=0;
        for(int i=0;i<nums.length;i++ ){
            if(nums[i]<pivot){
                low.add(nums[i]);
            }
            else if(nums[i]>pivot){
                high.add(nums[i]);
            }
            else{
                k++;
            }
        }
        int j=0;
        for(int num:low){
            nums[j]=num;
            j++;
        }
        for(int i=0;i<k;i++){
            nums[j]=pivot;
            j++;
        }
        for(int num:high){
            nums[j]=num;
            j++;
        }
        return nums;
    }
}