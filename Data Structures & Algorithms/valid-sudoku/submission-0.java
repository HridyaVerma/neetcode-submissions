class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n=board.length;
        int m=board[0].length;
        HashSet<String> map = new HashSet<>();

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                char current=board[i][j];

                if(current!='.'){
                if(map.contains(board[i][j]+" in row "+i))
                {
                    return false;
                }
                if(map.contains(board[i][j]+" in col "+ j))
                {
                    return false;
                }
                if(map.contains(board[i][j] +" in block "+(i/3)+"-"+(j/3)))
                {
                    return false;
                }

                map.add(board[i][j] + " in row " + i);
                map.add(board[i][j] + " in col " + j);
                map.add(board[i][j] + " in block " + (i/3) + "-" + (j/3));
                }



            }
        }

        return true;
        
    }
}
