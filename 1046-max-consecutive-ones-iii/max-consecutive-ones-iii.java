class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0,r=0;
        int res=0;
        int count=0;
        Queue<Integer> q=new LinkedList<>();
        while(l<=r&&r<nums.length){
            if(nums[r]==0&&k>0){
                q.add(r);
                k--;
                count++;
                r++;

            }
            else if(nums[r]==0&&k<=0){
                if(q.isEmpty()){
                    l=r;
                    count=r-l;
                    l++;
                    r++;
                }
                else{
                l=q.poll()+1;
                count=r-l;
                k++;
                }
            }
            else{
                count++;
                r++;
            }
                res=Math.max(res,count);
        }

        return res;
    }
}