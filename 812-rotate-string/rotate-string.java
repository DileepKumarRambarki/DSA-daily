class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        for(int i=0;i<s.length();i++){
            String pref=s.substring(0,i+1);
            String suf=s.substring(i+1,s.length());
            if(goal.contains(pref)&&goal.contains(suf)){
                return true;
            }
        }
        return false;
    }
}