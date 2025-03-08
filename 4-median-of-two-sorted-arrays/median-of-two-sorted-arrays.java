class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int n=n1+n2;
        int a=-1,b=-1;
       if(n%2==0){
        a=n/2-1;
        b=n/2;
       }
       else{
        a=n/2;
       }
        int i=0,j=0;
        int count=-1;
        int val=-1;
        int va=-1,vb=-1;
        while(i<n1&&j<n2){
            if(nums1[i]<nums2[j]){
                count++;
                val=nums1[i];
                i++;
            }
            else{
                count++;
                val=nums2[j];
                j++;
            }
            if(count==a){
                va=val;
            }
            if(count==b){
                vb=val;
                return (va+vb)/2.0;
            }
        }
        while(i<n1){
            count++;
            val=nums1[i];
            i++;
             if(count==a){
                va=val;
            }
            if(count==b){
                vb=val;
                return (va+vb)/2.0;
            }
        }
        while(j<n2){
            count++;
            val=nums2[j];
            j++;
             if(count==a){
                va=val;
            }
            if(count==b){
                vb=val;
                return (va+vb)/2.0;
            }
        }
        return va;
    }
}