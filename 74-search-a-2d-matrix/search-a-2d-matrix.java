class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low=0,high=matrix.length-1;
        int row=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(target>=matrix[mid][0]&& target<=matrix[mid][matrix[mid].length-1])
            {
                row=mid;
                break;
            }
            else if(target<=matrix[mid][0]){
                high=mid-1;
            } else{
                low=mid+1;
            }
            
        }
        if(row==-1) return false;
        low=0;
        high=matrix[row].length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(matrix[row][mid]==target){
                return true;
            }
            else if(matrix[row][mid]>=target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return false;
    }
}