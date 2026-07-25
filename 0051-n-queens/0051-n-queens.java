class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = '.';
            }
        }
        solve(0, board, ans);
        return ans;
    }
    public boolean issafe(char[][] board, int row, int col){
        int r = row;
        while(r >= 0){
            if(board[r][col] == 'Q') return false;
            r--;
        }

        r = row;
        int c = col;
        while(r >= 0 && c >= 0){
            if(board[r][c] == 'Q') return false;
            r--;
            c--;
        }

        r = row;
        c = col;
        while(r >= 0 && c < board.length){
            if(board[r][c] == 'Q')
            return false;
            r--;
            c++;
        }
        return true;
    }
    public void solve(int row, char[][] board, List<List<String>> ans){
         if(row == board.length){
            List<String> str = new ArrayList<>();
            for(int i=0; i<board.length; i++){
                String res = "";
                for(int j=0; j<board[0].length; j++){
                    res += board[i][j];
                }
                str.add(res);
            }
            ans.add(str);
            return;
        }
        for(int col=0; col<board[0].length; col++){
            if(issafe(board, row, col)){
                board[row][col] = 'Q';
                solve(row+1, board, ans);
            }
            board[row][col] = '.';
        }
    }
}