public class Offer12 {
    public boolean exist(char[][] board, String word) {
        for (int i=0;i<board.length;i++){
            for (int j=0;j<board[0].length;j++){
                if (BFS(board,word,i,j,0))
                    return true;
            }
        }
        return false;
    }

    public boolean BFS(char[][] board, String word, int x, int y, int index){
        if (index == word.length())
            return true;
        if (x<0||x>=board.length||y<0||y>=board[0].length)
            return false;
        if (board[x][y] == word.charAt(index)){
            board[x][y] = '\0';
            if (!BFS(board,word,x+1,y,index+1)){
                if (!BFS(board,word,x,y+1,index+1)) {
                    if (!BFS(board,word,x-1,y,index+1)) {
                        if (!BFS(board,word,x,y-1,index+1)) {
                            board[x][y] = word.charAt(index);
                            return false;
                        }
                    }
                    else
                        return true;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        char[][] board = {{'a'}};
        String word = "ab";
        Offer12 offer12 = new Offer12();
        System.out.println(offer12.exist(board, word));
    }
}
