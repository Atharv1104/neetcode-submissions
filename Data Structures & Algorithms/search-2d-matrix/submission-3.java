class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int col=matrix[0].length-1;
        for(int i=0;i<row;i++){
            
            if(target<= matrix[i][col]){
                int l=0;
                int r=col;
                while(l<=r){
                    int mid= l+(r-l)/2;
                    if(matrix[i][mid]>target){
                        r=mid-1;
                    }else if(matrix[i][mid]<target){
                        l=mid+1;
                    }else{
                        return true;
                    }
                }
            }
            

        }
        return false;
        
    }
}
