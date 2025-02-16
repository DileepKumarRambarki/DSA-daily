class Solution {
    public List<List<Integer>> generate(int numRows) {
        numRows--;
        List<List<Integer>> res=new ArrayList<>();
        if(numRows>=0){
        List<Integer> l1=new ArrayList<>();
        l1.add(1);
        res.add(l1);
        }
        if(numRows>=1){
        List<Integer> l2=new ArrayList<>();
        l2.add(1);l2.add(1);
        res.add(l2);
        }
        for(int i=2;i<=numRows;i++){
            List<Integer> l=new ArrayList<>();
            l.add(1);
            for(int j=1;j<=i-1;j++){
                l.add(res.get(i-1).get(j-1)+res.get(i-1).get(j));
            }
            l.add(1);
            res.add(l);
        }
        return res;
    }
}