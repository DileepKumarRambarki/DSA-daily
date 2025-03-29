class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        if(intervals.length==0) return new int[][]{{newInterval[0],newInterval[1]}};
        ArrayList<int[]> res=new ArrayList<>();

        for(int[] i:intervals){
            if(i[0]<newInterval[0]){
                res.add(i);
            }
            else if(!res.contains(newInterval)){
                res.add(newInterval);
                res.add(i);
            }
            else{
                res.add(i);
            }
        }
        if(!res.contains(newInterval)){
            res.add(newInterval);

        }
        for(int i=1;i<res.size();i++){
            int aim1=res.get(i-1)[0];
            int ajm1=res.get(i-1)[1];
            int ai=res.get(i)[0];
            int aj=res.get(i)[1];
            if(ai>=aim1&&ai<=ajm1&&aj>ajm1){
                res.set(i-1,new int[]{aim1,aj});
                res.remove(i);
                i--;
            }
            else if(ai>=aim1&&ai<=ajm1&&aj<=ajm1){
                res.remove(i);
                i--;
            }
        }
        int ans[][]=new int[res.size()][2];
        int k=0;
        for(int[] arr:res){
            ans[k++]=arr;
        }
        return ans;
    }
}