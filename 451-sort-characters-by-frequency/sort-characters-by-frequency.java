class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        int max=0;
        String res="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
            max=Math.max(max,hm.get(ch));
        }
        for(int i=max;i>0;i--){
            for(char f:hm.keySet()){
                if(hm.get(f)==i){
                    for(int k=0;k<i;k++){
                    res+=f;
                    }
                }
            }
        }
        return res;
    }
}