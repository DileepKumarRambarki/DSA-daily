class Solution {
    public int minimumRecolors(String blocks, int k) {
        int l=0;
        int r=k;
        int count=0;
        for(int i=0;i<k;i++){
            if(blocks.charAt(i)=='W'){
                count++;
            }
        }
        int res=count;
        
        while(r<blocks.length()&&l<blocks.length()){
            if(blocks.charAt(l)=='W'){
                count--;
            }
            if(blocks.charAt(r)=='W'){
                count++;
            }
            l++;
            r++;
            res=Math.min(res,count);
        }
        return res;
    }
}