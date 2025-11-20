package MatrixProcessing;

import java.util.ArrayList;
import java.util.Scanner;

public class MatrixDeterminant {
    public static void calculateDeterminant(Scanner scanner) {
        System.out.println("Enter the number of rows and columns of the matrix:");
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        if (n != m) {
            System.out.println("Number of rows and columns must be equal");
            return;
        }
        System.out.println("Enter the matrix");
        ArrayList<ArrayList<Double>> matrix = readMatrix(scanner, n, m);
        double determinant = findDeterminant(matrix);
        System.out.println("The determinant of the matrix is: " + determinant);
    }
    private static double findDeterminant(ArrayList<ArrayList<Double>> matrix) {
        int n = matrix.size();
        if (n == 1) {
            return matrix.get(0).get(0);
        }
        if (n == 2) {
            return matrix.get(0).get(0) * matrix.get(1).get(1) - matrix.get(0).get(1) * matrix.get(1).get(0);
        }
        double determinant = 0.0;
        for (int j = 0; j < n - 1; j++) {
            ArrayList<ArrayList<Double>> minor = getMinor(matrix, 0, j);
            double sign = (j % 2 == 0) ? 1.0 : -1.0;
            determinant += sign * matrix.get(0).get(j) * findDeterminant(minor);
        }
        return determinant;
    }
    private static ArrayList<ArrayList<Double>> getMinor(ArrayList<ArrayList<Double>> matrix, int row, int col) {
        int  n = matrix.size();
        ArrayList<ArrayList<Double>> minor = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (i == row) continue;
            ArrayList<Double> newRow = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if (j == col) continue;
                newRow.add(matrix.get(i).get(j));
            }
            minor.add(newRow);
        }
        return minor;
    }
    private static ArrayList<ArrayList<Double>> readMatrix(Scanner scanner, int n, int m) {
        ArrayList<ArrayList<Double>> matrix = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ArrayList<Double> row = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                row.add(scanner.nextDouble());
            }
            matrix.add(row);
        }
        return matrix;
    }
}
