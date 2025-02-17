class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,Integer> hm=new HashMap<>();
        List<List<String>> l=new ArrayList<>();
        if(strs.length==0) return l;
        int i=0;
        for(String s:strs){
            String ss=sortstr(s);
            if(hm.containsKey(ss)){
                l.get(hm.get(ss)).add(s);
            }
            else{
                hm.put(ss,i);
                List<String> l1=new ArrayList<>();
                l1.add(s);
                l.add(i,l1);
                i++;
            }
        } 
        return l;
    }
    static String sortstr(String str){
        char ch[]=str.toCharArray();
        Arrays.sort(ch);
        return Arrays.toString(ch);
    }
}