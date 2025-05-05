class Solution {
    public List<String> validStrings(int n) {
        StringBuilder sb=new StringBuilder();
        List<String> res=new ArrayList<>();
        for(int i=0;i<n;i++){
            sb.append("1");
        }
        res.add(sb.toString());
        rec(sb,res,-2,n);
        return res;
    }
    void rec(StringBuilder sb,List<String> res,int pos,int n){
        if(pos>=n) return ;
        for(int i=pos+2;i<n;i++){
            StringBuilder temp=new StringBuilder(sb);
            temp.setCharAt(i,'0');
            res.add(temp.toString());
            rec(temp,res,i,n);
        }
    }
}