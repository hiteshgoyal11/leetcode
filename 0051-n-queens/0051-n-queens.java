
import java.util.*;

class Solution {

    public boolean isSafe(char board[][], int row, int col) {

        // vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // diagonal left up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // diagonal right up
        for (int i = row - 1, j = col + 1;
             i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public void solve(char board[][], int row, List<List<String>> ans) {

        if (row == board.length) {
            List<String> result = new ArrayList<>();

            for (int i = 0; i < board.length; i++) {
                result.add(new String(board[i]));
            }

            ans.add(result);
            return;
        }

        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';

                solve(board, row + 1, ans);

                board[row][j] = '.';
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {

        char board[][] = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        List<List<String>> ans = new ArrayList<>();

        solve(board, 0, ans);

        return ans;
    }
}