class Solution {
    public String triangleType(int[] nums) {
        int a=nums[0];
        int b=nums[1];
        int c=nums[2];
        if((a+b<=c)||(a+c<=b)||(b+c<=a)){
            return "none";
        } 
        HashSet<Integer> hs=new HashSet<>();
        hs.add(a);
        hs.add(b);
        hs.add(c);
        if(hs.size()==1) return "equilateral";
        else if(hs.size()==2) return "isosceles";
        return "scalene";
    }
}