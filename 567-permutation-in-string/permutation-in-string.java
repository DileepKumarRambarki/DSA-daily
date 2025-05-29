class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int freq1[]=new int[26];
        for(int i=0;i<s1.length();i++){
            freq1[s1.charAt(i)-'a']++;
        }
        int l=0,r=0;
        while(r<s2.length()){
            char ch=s2.charAt(r);
            if(freq1[ch-'a']>0){
                int freq2[]=freq1.clone();
                int j=r;
                int count=0;
                if(s2.length()-r<s1.length()) return false;
                while(j-r<s1.length()){
                    if(freq2[s2.charAt(j)-'a']>0){
                        freq2[s2.charAt(j)-'a']--;
                        count++;
                    }
                    else{
                        break;
                    }
                    j++;
                }
                if(count==s1.length()) return true;
            }
            r++;
        }
        return false;
    }
}