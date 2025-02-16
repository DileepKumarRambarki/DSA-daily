class Solution {
    public int maxArea(int[] height) {
        int water=0;
        int n=height.length;
        int i=0,j=n-1;
        while(i<j){
            water=Math.max(water,(j-i)*Math.min(height[i],height[j]));
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