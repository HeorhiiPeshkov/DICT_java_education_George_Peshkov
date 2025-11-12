package MatrixProcessing;

import java.util.ArrayList;
import java.util.Scanner;

public class MatrixTransposing {
        public static void transposeMatrix(Scanner scanner) {
            System.out.println("Enter the number of rows and columns of the matrix:");
            int n1 = scanner.nextInt();
            int m1 = scanner.nextInt();
            System.out.println("Enter the matrix:");
            ArrayList<ArrayList<Double>> matrix = readMatrix(scanner, n1, m1);
            System.out.println("Choose your transposing way:" + "\n" + "1. Diagonal" + "\n" + "2. Vertical" + "\n" + "3. Horizontal");
            int transpose_choice = scanner.nextInt();
            ArrayList<ArrayList<Double>> result = null;
            switch (transpose_choice) {
                case 1:
                    result = transposeSideDiagonal(matrix);
                    break;
                case 2:
                    result = transposeVertical(matrix);
                    break;
                case 3:
                    result = transposeHorizontal(matrix);
                    break;
                default:
                    System.out.println("ERROR");
            }
            for (ArrayList<Double> row : result) {
                for (Double val : row) {
                    System.out.print(val + " ");
                }
                System.out.println();
            }
        }

        private static ArrayList<ArrayList<Double>> transposeSideDiagonal(ArrayList<ArrayList<Double>> matrix) {
            int n = matrix.size();
            int m = matrix.get(0).size();
            ArrayList<ArrayList<Double>> transposed = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                ArrayList<Double> row = new ArrayList<>();
                for (int j = 0; j < n; j++) {
                    row.add(matrix.get(i).get(j));
                }
                transposed.add(row);
            }
            return transposed;
        }

        private static ArrayList<ArrayList<Double>> transposeVertical(ArrayList<ArrayList<Double>> matrix) {
            int n = matrix.size();
            int m = matrix.get(0).size();
            ArrayList<ArrayList<Double>> transposed = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                ArrayList<Double> row = new ArrayList<>();
                for (int j = m - 1; j >= 0; j--) {
                    row.add(matrix.get(i).get(m - 1 - j));
                }
                transposed.add(row);
            }
            return transposed;
        }

        private static ArrayList<ArrayList<Double>> transposeHorizontal(ArrayList<ArrayList<Double>> matrix) {
            int n = matrix.size();
            ArrayList<ArrayList<Double>> transposed = new ArrayList<>();
            for (int i = n - 1; i >= 0; i--) {
                ArrayList<Double> row = new ArrayList<>(matrix.get(i));
                transposed.add(row);
            }
            return transposed;
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

