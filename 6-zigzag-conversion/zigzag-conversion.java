class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1) return s;
        int n=2*(numRows-1);
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<numRows;i++){
            for(int j=i;j<s.length();j++){
                if(j%n==i||j%n==(n-i)){
                    sb.append(s.charAt(j));
                }
            }
        }
        return sb.toString();
    }
}