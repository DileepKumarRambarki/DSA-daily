class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        int res=0;
        if(s.length()==0) return 0;
       int left=0,right=0;
       while(left<=right&&right<s.length()){
        char ch=s.charAt(right);
        if(hm.containsKey(ch)&&hm.get(ch)>=left){
            left=hm.get(ch)+1;
        }
        res=Math.max(res,right-left+1);
        hm.put(ch,right);
        right++;

       }
        return res;
    }
}