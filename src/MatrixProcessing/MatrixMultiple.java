package MatrixProcessing;

import java.util.ArrayList;
import java.util.Scanner;

public class MatrixMultiple {
    public static void multipleMatrices(Scanner scanner) {
            System.out.println("Enter the number of rows and columns of the matrix:");
            int n1 =  scanner.nextInt();
            int m1 = scanner.nextInt();
            System.out.println("Enter the first matrix:");
            ArrayList<ArrayList<Double>> A = readMatrix(scanner, n1, m1);
            System.out.println("Enter the number of rows and columns of the matrix:");
            int n2 = scanner.nextInt();
            int m2 = scanner.nextInt();
            System.out.println("Enter the second matrix:");
            ArrayList<ArrayList<Double>> B = readMatrix(scanner, n2, m2);
            if (m1 != n2) {
                System.out.println("ERROR");
                return;
            }
            ArrayList<ArrayList<Double>> result = new ArrayList<>();
            for (int i = 0; i < n1; i++) {
                ArrayList<Double> row = new ArrayList<>();
                for (int j = 0; j < m1; j++) {
                    row.add(0.0);
                }
                result.add(row);
            }
            for  (int i = 0; i < m1; i++) {
                for (int j = 0; j < m1; j++) {
                    double sum = 0.0;
                    for (int k = 0; k < n1; k++) {
                        sum += A.get(i).get(k) * B.get(k).get(j);
                    }
                    result.get(i).set(j, sum);
                }
            }
            System.out.println();
            for (ArrayList<Double> row : result) {
                for (Double val : row) {
                    System.out.print(val + " ");
                }
                System.out.println();
            }
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
