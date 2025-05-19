class Solution {
    public String triangleType(int[] nums) {
        int a=nums[0];
        int b=nums[1];
        int c=nums[2];
        if((a+b<=c)||(a+c<=b)||(b+c<=a)){
            return "none";
        } 
        HashSet<Integer> hs=new HashSet<>();
        for(int i:nums){
            hs.add(i);
        }
        if(hs.size()==1) return "equilateral";
        else if(hs.size()==2) return "isosceles";
        return "scalene";
    }
}