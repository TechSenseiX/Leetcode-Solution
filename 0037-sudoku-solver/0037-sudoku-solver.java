class Solution {
    public boolean isSafe(char board[][], int row, int col, char digits){
        for(int i=0; i<=8; i++){
            if(board[i][col] == digits){
               return false;
            }
            if(board[row][i] == digits){
                return false;
            }
            
        }

        //grid check
        int sr= (row/3)*3;
        int sc = (col/3)*3;

        for(int i=sr; i<sr+3; i++){
            for(int j=sc; j<sc+3; j++){
                if(board[i][j]== digits){
                    return false;
                }

            }
        }


        return true;

    }
    public boolean sudokuSolver(char board[][], int row, int col){
        if(row==9){
            return true;
        }

        int nextRow = row;
        int nextCol = col+1;
        if(col+1 == 9){
            nextRow = row+1;
            nextCol=0;
        }
        
        if(board[row][col] != '.'){
            return sudokuSolver(board, nextRow, nextCol);
        }

        for(char digits='1'; digits<='9'; digits++){
            if(isSafe(board, row, col, digits)){
                board[row][col]= digits;
                if(sudokuSolver(board, nextRow, nextCol)){
                    return true;
                }
                board[row][col]='.';
            }
        }
        return false;
    }
    public void solveSudoku(char[][] board) {
        sudokuSolver(board, 0, 0);
    }
}