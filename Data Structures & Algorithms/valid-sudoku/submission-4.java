class Solution {
    public boolean isValidSudoku(char[][] board) {
        var count1 = new HashMap<String,Integer>();
        var count2 = new HashMap<String,Integer>();

        char x = '#';
        char y = '#';

        for(int i = 0 ; i < 9 ; i++){
            count1 = new HashMap<String,Integer>();
            count2 = new HashMap<String,Integer>();
            for(int j = 0 ; j<9 ; j++){
                x = board[i][j];
                y = board[j][i];
               if (x != '.') {
    count1.put(String.valueOf(x), count1.getOrDefault(String.valueOf(x), 0) + 1);
    if (count1.get(String.valueOf(x)) > 1) return false;
}

if (y != '.') {
    count2.put(String.valueOf(y), count2.getOrDefault(String.valueOf(y), 0) + 1);
    if (count2.get(String.valueOf(y)) > 1) return false;
}

             }
        }
        for (int boxRow = 0; boxRow < 3; boxRow++) {
    for (int boxCol = 0; boxCol < 3; boxCol++) {
        var count = new HashMap<String, Integer>();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                 x = board[boxRow * 3 + i][boxCol * 3 + j];

                if (x == '.') continue;

                String key = String.valueOf(x);
                count.put(key, count.getOrDefault(key, 0) + 1);

                if (count.get(key) > 1) return false;
            }
        }
    }
}
        
        return true;
    }
}
