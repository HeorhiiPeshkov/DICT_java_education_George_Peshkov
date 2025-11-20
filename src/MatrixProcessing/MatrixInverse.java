package MatrixProcessing;

import java.util.ArrayList;
import java.util.Scanner;

public class MatrixInverse {
    public static void inverseMatrix (Scanner scanner) {
        System.out.println("Enter the number of rows and columns of the matrix:");
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        if (n != m) {
            System.out.println("Number of rows and columns must be equal");
            return;
        }
        System.out.println("Enter the matrix");
        ArrayList<ArrayList<Double>> matrix = readMatrix(scanner, n, m);
        double det = findDeterminant(matrix);
        if (det == 0) {
            System.out.println("You cannot inserve the matrix");
            return;
        }
        ArrayList<ArrayList<Double>> adj = adjugate(matrix);
        ArrayList<ArrayList<Double>> inverse = multipleByConstant(adj, 1.0/det);
        System.out.println("The inverse of the matrix is: " + inverse);
        printMatrix(inverse);
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
        for (int j = 0; j < n; j++) {
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
    private static ArrayList<ArrayList<Double>> adjugate(ArrayList<ArrayList<Double>> matrix) {
        int n = matrix.size();
        ArrayList<ArrayList<Double>> cofactor = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ArrayList<Double> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                ArrayList<ArrayList<Double>> minor = getMinor(matrix, i, j);
                double sign = ((i + j) % 2 == 0) ? 1.0 : -1.0;
                row.add(sign * findDeterminant(minor));
            }
            cofactor.add(row);
        }
        ArrayList<ArrayList<Double>> adjugate = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ArrayList<Double> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(cofactor.get(j).get(i));
            }
            adjugate.add(row);
        }
        return adjugate;
    }
    public static ArrayList<ArrayList<Double>> multipleByConstant(ArrayList<ArrayList<Double>> matrix, double constant) {
        int n = matrix.size();
        int m = matrix.get(0).size();
        ArrayList<ArrayList<Double>> result = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            ArrayList<Double> row = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                double val = Math.round(matrix.get(i).get(j) * constant * 100.0) / 100.0;
                row.add(val);
            }
            result.add(row);
        }
        return result;
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
    private static void printMatrix(ArrayList<ArrayList<Double>> matrix) {
        for (ArrayList<Double> row : matrix) {
            for (Double val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
