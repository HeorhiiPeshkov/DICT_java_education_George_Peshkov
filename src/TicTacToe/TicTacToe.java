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
    }
}