class Solution {
    public boolean isValidSudoku(char[][] board) {
        //9*9
    //     Set<Character> set;
    //     for(int row = 0; row<9; row++){
    //         set = new HashSet<>();
    //         for(int column = 0; column<9; column++){
    //             if(set.contains(board[row][column])) return false;
    //             if(board[row][column]!='.')set.add(board[row][column]);
    //         }
    //     }
    //     for(int row = 0; row<9; row++){
    //         set = new HashSet<>();
    //         for(int column = 0; column<9; column++){
    //             if(set.contains(board[column][row])) return false;
    //             if(board[column][row]!='.')set.add(board[column][row]);
    //         }
    //     }

    //     for(int sr=0; sr<9; sr = sr+3){
    //         for(int sc=0; sc<9; sc = sc+3){
    //             int er = sr+2;
    //             int ec = sc+2;
    //             if(traversal(sr,er,sc,ec,board)==false) return false;
    //         }
    //     }

    //     return true;
    // }

    // public static boolean traversal(int sr, int er, int sc, int ec, char[][] board){
    //     Set<Character> set = new HashSet<>();
    //     for(int i=sr; i<=er; i++){
    //         for(int j=sc; j<=ec; j++){
    //                 if(set.contains(board[i][j])) return false;
    //             if(board[i][j]!='.')set.add(board[i][j]);
    //         }
    //     }
    //     return true;
        Set<String> st = new HashSet<>();
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(board[i][j]=='.') continue;
                String row = "I found in row "+i+" is "+board[i][j];
                String col = "I found in col "+j+" is "+board[i][j];
                String box = "I found in box"+i/3+" "+j/3+ " is "+board[i][j];

                if(st.contains(row) || st.contains(col) || st.contains(box)) return false;
                st.add(row); st.add(col); st.add(box);
            }
        }
        return true;
    } 
}