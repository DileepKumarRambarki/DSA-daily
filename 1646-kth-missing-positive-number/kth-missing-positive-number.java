class Solution {
    public int findKthPositive(int[] arr, int k) {
        int j=0;
        int count=0;
        for(int i=1;i<=arr[arr.length-1];i++){
            if(arr[j]==i){
                j++;
            }
            else{
                count++;
            }
            if(count==k) return i;
        }
        return arr[arr.length-1]+k-count;
    }
}