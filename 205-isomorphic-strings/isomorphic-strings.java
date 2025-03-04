class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> h1=new HashMap<>();
        HashMap<Character,Character> h2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);
            if(!h1.containsKey(ch1)&&!h2.containsKey(ch2)){
                h1.put(ch1,ch2);
                h2.put(ch2,ch1);
            }
            else if(h1.containsKey(ch1)&&h1.get(ch1)!=ch2){
                return false;
            }
            else if(h2.containsKey(ch2)&&h2.get(ch2)!=ch1){
                return false;
            }
        }
        return true;
    }
}