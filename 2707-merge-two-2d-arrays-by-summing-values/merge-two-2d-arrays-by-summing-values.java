class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int i=0,j=0;
        List<int[]> l=new ArrayList<>();
        while(i<n1&&j<n2){
            if(nums1[i][0]<nums2[j][0]){
                l.add(new int[]{nums1[i][0],nums1[i][1]});
                i++;
            }
            else if(nums1[i][0]>nums2[j][0]){
                l.add(new int[]{nums2[j][0],nums2[j][1]});
                j++;
            }
            else{
                l.add(new int[]{nums1[i][0],nums1[i][1]+nums2[j][1]});
                i++;
                j++;
            }
        }
        while(i<n1){

                l.add(new int[]{nums1[i][0],nums1[i][1]});
                i++;
        }
        while(j<n2){
                l.add(new int[]{nums2[j][0],nums2[j][1]});
                j++;

        }
        int res[][]=new int[l.size()][2];
        int k=0;
        for(int[] id:l){
            res[k][0]=id[0];
            res[k][1]=id[1];
            k++;
        }
        return res;
    }
}