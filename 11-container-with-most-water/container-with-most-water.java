class Solution {
    public int maxArea(int[] height) {
        int water=0;
        int n=height.length;
        int i=0,j=n-1;
        while(i<j){
            int sum=0;
            if(height[i]<height[j]){
                sum=(j-i)*height[i];
            }
            else{
                sum=(j-i)*height[j];
            }
            if(sum>water){
                water=sum;
            }
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return water;
    }
}