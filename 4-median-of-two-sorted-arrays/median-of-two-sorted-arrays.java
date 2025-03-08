class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int n=n1+n2;
        int res[]=new int[n];
        int a=-1,b=-1;
       
        int i=0,j=0;
        int count=0;
        while(i<n1&&j<n2){
            if(nums1[i]<nums2[j]){
                res[count++]=nums1[i];
                i++;
            }
            else{
                res[count++]=nums2[j];
                j++;
            }

        }
        while(i<n1){
            res[count++]=nums1[i];
            i++;
        }
        while(j<n2){
            res[count++]=nums2[j];
            j++;
        }
        if(n%2==0){
            a=n/2-1;
            b=n/2;
            return (res[a]+res[b])/2.0;
        }
        return res[n/2];
    }
}