/*The N-Queens problem is a classic chess puzzle.The goal is to place N queens on an N×N chessboard in such a way that no two queens threaten each other.This program
uses a recursive backtracking approach to find all distinct solutions for placing N queens on the chessboard. It explores each possible placement and prints the count
of solutions along with the board.*/



package Strings_SubStrings;

public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        boolean [] [] board = new boolean [n][n];
        System.out.println(queens(board,0));
    }


    static int queens(boolean[][] board, int r){
        if(r == board.length) {
            display(board);
            System.out.println();
            return 1;
        }
        int count = 0;
        for (int c = 0; c < board.length; c++) {        //placing the queen and checking for every row and col
            if(isSafe(board,r,c)){                     //place the queen if it's safe
                board[r][c] = true;
                count += queens(board,r+1);
                board[r][c] = false;
            }
        }
        return count;
    }


    private static boolean isSafe(boolean[][] board, int r, int c) {
        //check vertical row
        for (int i = 0; i < r; i++) {
            if(board[i][c])//checks for presence of Q in the current position
                return false;
        }
        //diagonal left
        int maxLeft = Math.min(r,c);//checks for presence of Q in diagonal left
        for (int i = 1; i <=maxLeft ; i++) {
            if(board[r-i][c-i])
                return false;
        }
        //diagonal right
        int maxRight = Math.min(r, board.length -1-c);//checks for presence of Q in diagonal right
        for (int i = 1; i <=maxRight ; i++) {
            if(board[r-i][c+i])
                return false;
        }
        return true;
    }


    private static void display(boolean[][] board) {
        for(boolean[] row : board){
            for(boolean ele : row){
                if(ele)
                    System.out.print("Q ");
                else
                    System.out.print("X ");
            }
            System.out.println();

        }
        System.out.println();
    }
}
