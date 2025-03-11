class Solution {
    public int numberOfSubstrings(String s) {
        int sum=0;
        int freq[]={0,0,0};
        int i=0;
        for(int j=0;j<s.length();j++){
            freq[s.charAt(j)-'a']++;
            while(freq[0]>0&&freq[1]>0&&freq[2]>0){
                sum+=s.length()-j;
                freq[s.charAt(i)-'a']--;
                i++;
            }
        }
        return sum;
    }
}