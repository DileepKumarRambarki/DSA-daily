class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i:nums1){
            hs.put(i,0);
        }
        for(int i:nums2){
            if(hs.containsKey(i)){
                hs.put(i,1);
            }
        }
        int k=0;
        for(int i:hs.values()){
            if(i==1){
                k++;
            }
        }
        int res[]=new int[k];
        k=0;
        for(int i:hs.keySet()){
            if(hs.get(i)==1){
                res[k++]=i;
            }
        }
        return res;
    }
}