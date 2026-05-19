class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        for(int i=0;i<9;i++){
            Set <Character> rowset= new HashSet<>();
            Set <Character> colset= new HashSet<>();
            Set <Character> boxset= new HashSet<>();
            for(int j=0;j<9;j++){
                if( board[i][j]!='.'){
                    if(rowset.contains(board[i][j])){
                        return false;
                    }else{
                        rowset.add(board[i][j]);
                    }
                }
                if( board[j][i]!='.'){
                    if(colset.contains(board[j][i])){
                        return false;
                    }else{
                        colset.add(board[j][i]);
                    }
                }
                int newi=(i/3)*3+(j/3);
                int newj=(i%3)*3+(j%3);
                if( board[newi][newj]!='.'){
                    if(boxset.contains(board[newi][newj])){
                        return false;
                    }else{
                        boxset.add(board[newi][newj]);
                    }
                }

            }
        }
        return true;
    }
    
}
