class Solution {
    public int countLargestGroup(int n) {
        int freq[]=new int[37];
        int max=0;
        for(int i=1;i<=n;i++){
            int sum=digsum(i);
            freq[sum]++;
            max=Math.max(max,freq[sum]);
        }
        int res=0;
        for(int i:freq){
            if(i==max){
                res++;
            }
        }
        return res;
    }
    int digsum(int n){
        int sum=0;
        for(int i=n;i>0;i/=10){
            sum+=i%10;
        }
        return sum;
    }
}