import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> visited = new HashSet<>();

        for (int i = 0; i < board.length; ++i) {
            for (int j = 0; j < board[0].length; ++j) {
                if (board[i][j] == '.') {
                    continue;
                }

                if (!visited.add(board[i][j] + "r" + i) ||             //value 'r' row
                        !visited.add(board[i][j] + "c" + j) ||         //value 'c' col
                        !visited.add(board[i][j] + "s" + i/3 + j/3)) { //value 's' rowcol (squares)
                    return false;
                }
            }
        }
        return true;
    }
}
