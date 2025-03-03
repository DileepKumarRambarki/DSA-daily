class Solution {
    public String largestOddNumber(String num) {
        // for(int i=num.length()-1;i>=0;i--){
        //     if(Integer.valueOf(num.charAt(i))%2==1){
        //         return num.substring(0,i+1);
        //     }
        // }  
        int ind=-1;
        ind=Math.max(num.lastIndexOf('1'),ind);
        ind=Math.max(num.lastIndexOf('3'),ind);
        ind=Math.max(num.lastIndexOf('5'),ind);
        ind=Math.max(num.lastIndexOf('7'),ind);
        ind=Math.max(num.lastIndexOf('9'),ind);

        return num.substring(0,ind+1);
    }
}