class Solution {
    public static boolean isSafe(char board[][],int n, int row , int col){
        //left diag
        for(int i=row-1 , j= col-1; i>=0 && j>=0; i--, j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        //upward
        for(int i=row-1; i>=0; i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        //right diag
        for(int i=row-1, j=col+1; j<n && i>=0; j++,i--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        return true;
    }
    public static void nQueens(char board[][], int row,List<List<String>> ans){
        int n = board.length;
         //base case
         if(row== board.length){
            List<String> ds= new ArrayList<>();
            for(int i =0; i< board.length; i++){
                
                    ds.add(new String(board[i]));
                
            }
            ans.add(ds);
            return;
         }

         //placed n queens in n rows
         for(int j =0; j<board.length; j++){
            if(isSafe(board,n, row, j)){
                board[row][j]='Q';
                nQueens(board, row+1,ans);
                board[row][j]='.';
            }
         }
    }

    public List<List<String>> solveNQueens(int n) {
        char board[][]= new char[n][n];
        for(int i =0; i< n; i++){
           for(int j =0; j<n ; j++){
            board[i][j]='.';
           }
        }

        List<List<String>> ans= new ArrayList<>();
        nQueens(board,0,ans);
        return ans;


    }
}