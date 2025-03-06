class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int xor=0;
        int k=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                xor^=grid[i][j];
                k++;
                xor^=k;
            }
        }
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
               if(hm.containsKey(grid[i][j])){
                return new int[]{grid[i][j],xor^grid[i][j]};
               }
               else{
                hm.put(grid[i][j],1);
               }
            }
        }
        return new int[]{-1,-1};
    }
}