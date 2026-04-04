class Solution {
    public boolean isValidSudoku(char[][] board) {
        int N = 9;

        HashSet<Character>[] rows = new HashSet[N];
        HashSet<Character>[] columns = new HashSet[N];
        HashSet<Character>[] boxes = new HashSet[N];

        //initialize
        for(int i = 0; i<N;i++){
            rows[i] = new HashSet<Character>();
            columns[i] = new HashSet<Character>();
            boxes[i] = new HashSet<Character>();
        }

        for(int row = 0; row<N;row++){
            for(int col = 0; col<N;col++){
                char val = board[row][col];

                if(val=='.'){
                    continue;
                }

                if(rows[row].contains(val)){
                    return false;
                }
                rows[row].add(val);

                if(columns[col].contains(val)){
                    return false;
                }
                columns[col].add(val);

                //for box
                int idx = (row/3)*3 + col/3;

                if(boxes[idx].contains(val)){
                    return false;
                }
                boxes[idx].add(val);
            }
        }
        return true;
    }
}