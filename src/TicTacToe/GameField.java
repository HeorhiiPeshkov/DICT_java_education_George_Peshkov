package TicTacToe;

import java.util.ArrayList;

public class GameField {
    private char[] cells = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
    public void print() {
        System.out.print("------------------" + "\n");
        for (int i = 0; i < 9; i+=3) {
            System.out.print("| " + cells[i] + " " + cells[i + 1] + " " + cells[i + 2] + " |" + "\n");
        }
        System.out.print("------------------" + "\n" + ">");
    }
    public boolean placeMark(int row, int col, char mark) {
        if (row < 1 || row > 3 || col < 1 || col > 3) return false;
        int index = (row - 1) * 3 + col - 1;
        if (cells[index] != ' ') return false;
        cells[index] = mark;
        return true;
    }
    public boolean checkWin(char p){
        int[][] wins = {
                {0, 1, 2}, {3, 4, 5}, {6, 7, 8},
                {0, 3, 6}, {1, 4, 7}, {2, 5, 8},
                {0, 4, 8}, {2, 4, 6}
        };
        for (int[] w : wins) {
            if (cells[w[0]] == p && cells[w[1]] == p && cells[w[2]] == p) return true;
        }
    return false;
    }
    public boolean isDraw() {
        for (char c : cells)
            if (c == ' ') return false;
        return true;
    }
}
