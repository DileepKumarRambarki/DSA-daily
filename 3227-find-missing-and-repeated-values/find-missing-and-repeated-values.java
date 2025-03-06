class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int xor=0;
        int k=0;
        long sum=0,sqsum=0;
        int n=grid.length*grid.length;
        long ogsum=(long)n*(n+1)/2;
       long  ogsqsum=(long)n*(n+1)*(2*n+1)/6;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                sum+=grid[i][j];
                sqsum+=grid[i][j]*grid[i][j];
            }
        }
        long amb=ogsum-sum;
        long apb=(ogsqsum-sqsum)/amb;
        int a=(int)((amb+apb)/2);
        int b=(int)(apb-a);
        return new int[]{b,a};
    }
}