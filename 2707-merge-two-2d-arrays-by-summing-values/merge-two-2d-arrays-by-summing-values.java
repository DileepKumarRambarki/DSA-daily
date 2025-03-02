class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int i=0,j=0;
        LinkedHashMap<Integer,Integer> hm=new LinkedHashMap<>();
        while(i<n1&&j<n2){
            if(nums1[i][0]<nums2[j][0]){
                hm.put(nums1[i][0],hm.getOrDefault(nums1[i][0],0)+nums1[i][1]);
                i++;
            }
            else{
                hm.put(nums2[j][0],hm.getOrDefault(nums2[j][0],0)+nums2[j][1]);
                j++;
            }
        }
        while(i<n1){
             hm.put(nums1[i][0],hm.getOrDefault(nums1[i][0],0)+nums1[i][1]);
                i++;
        }
        while(j<n2){
            hm.put(nums2[j][0],hm.getOrDefault(nums2[j][0],0)+nums2[j][1]);
                j++;

        }
        int res[][]=new int[hm.size()][2];
        int k=0;
        for(int id:hm.keySet()){
            res[k][0]=id;
            res[k][1]=hm.get(id);
            k++;
        }
        return res;
    }
}