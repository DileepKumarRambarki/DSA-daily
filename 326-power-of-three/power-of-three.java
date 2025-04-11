class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==0) return false;
        int pow=(int)Math.round((Math.log(n)/Math.log(3)));
        if(Math.pow(3,pow)==n) return true;
        return false;
    }
}