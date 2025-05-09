class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res=new ArrayList<>();
        if(digits.length()==0){
            return res;
        }
        HashMap<Character,char[]> keys=new HashMap<>();
        keys.put('2',new char[]{'a','b','c'});
        keys.put('3',new char[]{'d','e','f'});
        keys.put('4',new char[]{'g','h','i'});
        keys.put('5',new char[]{'j','k','l'});
        keys.put('6',new char[]{'m','n','o'});
        keys.put('7',new char[]{'p','q','r','s'});
        keys.put('8',new char[]{'t','u','v'});
        keys.put('9',new char[]{'w','x','y','z'});
        StringBuilder sb=new StringBuilder();
        rec(sb,res,0,digits,keys);
        return res;
    }
    void rec(StringBuilder sb, List<String> res,int pos,String digits, HashMap<Character,char[]> keys){
        if(pos==digits.length()){
            res.add(sb.toString());
            return;
        }
        char ch=digits.charAt(pos);
        char arr[]=keys.get(ch);
        for(char a:arr){
            // StringBuilder temp=new StringBuilder(sb);
            sb.append(a);
            rec(sb,res,pos+1,digits,keys);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}