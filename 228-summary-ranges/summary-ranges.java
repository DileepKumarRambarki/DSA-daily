class Solution {
    public List<String> summaryRanges(int[] nums) {

        List<String> l=new ArrayList<>();
        if(nums.length==0) return l;
        int low=0,high=-1;
        int i=0;
        while(i<nums.length-1){
            if(nums[i]+1!=nums[i+1]){
                if(low==i){
                    l.add(Integer.toString(nums[i]));
                    low=i+1;
                }
                else{
                String s=Integer.toString(nums[low])+"->"+Integer.toString(nums[i]);
                l.add(s);
                low=i+1;
                }
            }
            i++;
        }
        if(low==i){
                    l.add(Integer.toString(nums[i]));
                }
                else{
                String s=Integer.toString(nums[low])+"->"+Integer.toString(nums[i]);
                l.add(s);
                low=i+1;
                }
                return l;
    }
}