class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            var row = new HashSet<Character>();
            var col = new HashSet<Character>();

            for (int j = 0; j < 9; j++) {
                char x = board[i][j];
                char y = board[j][i];

                if (x != '.' && !row.add(x)) return false;
                if (y != '.' && !col.add(y)) return false;
            }
        }

        for (int boxRow = 0; boxRow < 3; boxRow++) {
            for (int boxCol = 0; boxCol < 3; boxCol++) {
                var box = new HashSet<Character>();

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        char x = board[boxRow * 3 + i][boxCol * 3 + j];

                        if (x != '.' && !box.add(x)) return false;
                    }
                }
            }
        }

        return true;
    }
}