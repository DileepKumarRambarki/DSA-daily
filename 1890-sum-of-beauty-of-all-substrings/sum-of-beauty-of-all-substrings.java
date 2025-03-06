class Solution {
    public int beautySum(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
        int freq[]=new int[26];
            for(int j=i;j<s.length();j++){
                char ch=s.charAt(j);
                freq[ch-'a']++;
                int minfreq=500;
               int  maxfreq=0;
               for(int k=0;k<26;k++){
                if(freq[k]>0){
                    minfreq=Math.min(minfreq,freq[k]);
                    maxfreq=Math.max(maxfreq,freq[k]);
                }
               }
                    sum+=(maxfreq-minfreq);
            }
        }
        return sum;
    }
}