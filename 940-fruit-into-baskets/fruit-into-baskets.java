class Solution {
    public int totalFruit(int[] fruits) {
        int buca=-1,bucb=-1;
        int ca=0,cb=0;
        int l=0,r=0;
        int res=0;
        while(r<fruits.length){
            int curr=fruits[r];
            if(buca==-1||curr==buca){
                buca=curr;
                ca++;
            }
            else if(bucb==-1||curr==bucb){
                bucb=curr;
                cb++;
            }
            else{
                res=Math.max(res,ca+cb);
                int prev=fruits[r-1];
                l=r-1;
                while(l>=0&&fruits[l]==prev){
                    l--;
                }
                ca=r-l-1;
                buca=prev;
                bucb=curr;
                cb=1;

            }
            r++;
        }
        res=Math.max(res,ca+cb);
        return res;
    }
}