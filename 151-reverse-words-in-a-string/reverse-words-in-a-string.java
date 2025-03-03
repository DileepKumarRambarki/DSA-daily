class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String arr[]=s.split(" ");
        String res="";
        for(int i=arr.length-1;i>=0;i--){
            arr[i]=arr[i].trim();
            if(arr[i].length()>0){
            res+=arr[i];
            res+=" ";
            }
        }
        res=res.trim();
        return res;
    }
}