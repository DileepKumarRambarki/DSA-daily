class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int i=0;
        int j=1;
        int n=colors.length;
        int res=0;
        int arr[]=new int[2*n];
        for(int l=0;l<n;l++){
            arr[l+n]=colors[l];
            arr[l]=colors[l];
        }
        while(i<n){
            if(j-i+1==k&&arr[j]!=arr[j-1]){
                i++;
                j++;
                res++;
            }
            else if(arr[j]!=arr[j-1]){
                j++;
            }
            else if(arr[j]==arr[j-1]){
                i=j;
                j++;
            }
        }
        return res;
    }
}