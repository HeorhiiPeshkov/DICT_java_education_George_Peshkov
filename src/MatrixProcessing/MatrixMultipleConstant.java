package MatrixProcessing;

import java.util.ArrayList;
import java.util.Scanner;

public class MatrixMultiple {
    public static void multipleMatrix(Scanner scanner) {
        System.out.println("Enter row");
        int n = scanner.nextInt();
        System.out.println("Enter col");
        int m = scanner.nextInt();
        System.out.println("Enter const");
        double constant = scanner.nextDouble();
        System.out.println("Enter your matrix");
        ArrayList<ArrayList<Double>> matrix = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ArrayList<Double> row = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                row.add(scanner.nextDouble());
            }
            matrix.add(row);
        }
        ArrayList<ArrayList<Double>> resultMatrix = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ArrayList<Double> resultRow = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                double multipliedValue = matrix.get(i).get(j) * constant;
                resultRow.add(multipliedValue);
            }
            resultMatrix.add(resultRow);
        }
        for (ArrayList<Double> row : resultMatrix) {
            System.out.println(row);
        }
    }
}



