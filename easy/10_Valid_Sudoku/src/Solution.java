import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        //check all rows
        //check all cols
        //check all squares

        Set<Character> visited = new HashSet<>();
        //cols
        for (char[] chars : board) {
            for (int j = 0; j < board[0].length; ++j) {
                if (!isValidField(visited, chars[j])) {
                    return false;
                }
            }
            visited.clear();
        }

        //rows
        for (int i = 0; i < board[0].length; ++i) {
            for (char[] chars : board) {
                if (!isValidField(visited, chars[i])) {
                    return false;
                }
            }
            visited.clear();
        }

        //squares
        for (int i = 0 ; i < board.length; i+=3) {
            for (int j = 0; j < board[0].length; j+=3) {
                if (!checkSquare(board, i, j)) {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean checkSquare(char[][] board, int startRow, int startCol) {
        Set<Character> visited = new HashSet<>();

        for (int i = startRow; i < startRow + 3; ++i) {
            for (int j = startCol; j < startCol + 3; ++j) {
                if (!isValidField(visited, board[i][j])) {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean isValidField(Set<Character> visited,  char value) {
        if (value == '.') {
            return true;
        }

        return visited.add(value);
    }
}
