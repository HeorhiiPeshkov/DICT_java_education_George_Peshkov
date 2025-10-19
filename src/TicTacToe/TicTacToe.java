package TicTacToe;
import java.util.Scanner;
import java.util.ArrayList;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------");
        String cells = scanner.nextLine();
        System.out.println("| " + cells.charAt(0) + "" + cells.charAt(1) + "" + cells.charAt(2) + "|" + "\n");
        System.out.println("| " + cells.charAt(3) + "" + cells.charAt(4) + "" + cells.charAt(5) + "|" + "\n");
        System.out.println("| " + cells.charAt(6) + "" + cells.charAt(7) + "" + cells.charAt(8) + "|" + "\n");
        System.out.println("---------");
        if (cells.length() != 9) {
            System.out.println("Game not finished");
            return;
        }
        if  (cells.charAt(0) == 'X' && cells.charAt(1) == 'X' && cells.charAt(2) == 'X'||
            cells.charAt(0) == 'X' && cells.charAt(3) == 'X' && cells.charAt(6) == 'X' ||
            cells.charAt(1) == 'X' && cells.charAt(4) == 'X' && cells.charAt(7) == 'X'||
            cells.charAt(2) == 'X' && cells.charAt(5) == 'X' && cells.charAt(8) == 'X'||
            cells.charAt(6) == 'X' && cells.charAt(7) == 'X' && cells.charAt(8) == 'X'||
            cells.charAt(3) == 'X' && cells.charAt(4) == 'X' && cells.charAt(5) == 'X'||
            cells.charAt(0) == 'X' && cells.charAt(4) == 'X' && cells.charAt(8) == 'X'||
            cells.charAt(2) == 'X' && cells.charAt(4) == 'X' && cells.charAt(6) == 'X') {
            System.out.println("X win");
        } else if (cells.charAt(0) == 'O' && cells.charAt(1) == 'O' && cells.charAt(2) == 'O'||
                cells.charAt(0) == 'O' && cells.charAt(3) == 'O' && cells.charAt(6) == 'O' ||
                cells.charAt(1) == 'O' && cells.charAt(4) == 'O' && cells.charAt(7) == 'O'||
                cells.charAt(2) == 'O' && cells.charAt(5) == 'O' && cells.charAt(8) == 'O'||
                cells.charAt(6) == 'O' && cells.charAt(7) == 'O' && cells.charAt(8) == 'O'||
                cells.charAt(3) == 'O' && cells.charAt(4) == 'O' && cells.charAt(5) == 'O'||
                cells.charAt(0) == 'O' && cells.charAt(4) == 'O' && cells.charAt(8) == 'O'||
                cells.charAt(2) == 'O' && cells.charAt(4) == 'O' && cells.charAt(6) == 'O') {
            System.out.println("O win");
        } else {
            System.out.println("Impossible");
        }
    }
}
