class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1) return intervals;
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int m=intervals.length;
        int i=0;
        int start=intervals[0][0];
        List<List<Integer>> l=new ArrayList<>();
        while(i<m-1){
            if(intervals[i][1]<intervals[i+1][0]){
                List<Integer> l1=new ArrayList<>();
                l1.add(start);
                l1.add(intervals[i][1]);
                l.add(l1);
                start=intervals[i+1][0];
            }
            if(intervals[i][1]>intervals[i+1][1]){
                intervals[i+1][1]=intervals[i][1];
            }
            i++;
        }
        List<Integer> l1=new ArrayList<>();
                l1.add(start);
                l1.add(intervals[i][1]);
                l.add(l1);
        int res[][]=new int[l.size()][2];
        for(int j=0;j<l.size();j++){
            res[j][0]=l.get(j).get(0);
            res[j][1]=l.get(j).get(1);
        }
        return res;
    }
}