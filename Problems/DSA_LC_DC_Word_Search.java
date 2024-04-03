package Problems;

public class DSA_LC_DC_Word_Search {
    public static void main(String[] args) {
        char[][] array = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        System.out.println("The Word has been found inside the grid: " + exist(array, "ABCCED"));
    }

    public static boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        int index = 0;
        // First we will find out if the first letter is present in the grid or not
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(index)) {
                    // After finding the first letter we will apply backtracking here
                    if (searchNext(board, word, index, i, j, m, n)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean searchNext(char[][] board, String word, int index, int row, int col, int m, int n) {
        if (index == word.length()) {
            return true;
        }

        // Check for all the possible edge cases
        // -> if the row or col goes out of the grid
        // -> or the grid does not have the required character
        // -> or the character is !..which will be assigned by us to avoid visiting the same character after finding the required character
        if (row < 0 || col < 0 || row == m || col == n || board[row][col] != word.charAt(index) || board[row][col] == '!') {
            return false;
        }

        // assign the character to another variable for the time being before searching for next character
        char c = board[row][col];
        board[row][col] = '!';

        boolean top = searchNext(board, word, index + 1, row + 1, col, m, n);
        boolean down = searchNext(board, word, index + 1, row - 1, col, m, n);
        boolean left = searchNext(board, word, index + 1, row, col - 1, m, n);
        boolean right = searchNext(board, word, index + 1, row, col + 1, m, n);

        board[row][col] = c;

        return top || down || left || right;
    }
}
