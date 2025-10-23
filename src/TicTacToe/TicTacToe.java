package TicTacToe;
import java.util.Scanner;

public class TicTacToe {
    private GameField gameField = new GameField();
    private char currentPlayer = 'X';
    private boolean gameOver = false;

    public void start() {
        Scanner scanner = new Scanner(System.in);
        gameField.print();
        while (!gameOver) {
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            if(!gameField.placeMark(row, col, currentPlayer)) {
                System.out.println("Invalid mark");
                continue;
            }
            gameField.print();

            if (gameField.checkWin(currentPlayer)) {
                System.out.println(currentPlayer + " Wins!");
                gameOver = true;
            } else if (gameField.isDraw()) {
                System.out.println("Draw!");
                gameOver = true;
            } else {
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                        }
        }
    }
}