package MatrixProcessing;

import java.util.ArrayList;
import java.util.Scanner;

public class MatrixSum {
    public static void addMatrix(Scanner scanner) {
            System.out.print("Enter number of rows and columns for your matrix: ");
            int n1 = scanner.nextInt();
            int m1 = scanner.nextInt();
            ArrayList<ArrayList<Double>> A = new ArrayList<>();
            for (int i = 0; i < n1; i++) {
                ArrayList<Double> row = new ArrayList<>();
                for (int j = 0; j < m1; j++) {
                    row.add(scanner.nextDouble());
                }
                A.add(row);
            }
            System.out.print("Enter number of rows and columns for your matrix: ");
            int n2 =  scanner.nextInt();
            int m2 = scanner.nextInt();
            ArrayList<ArrayList<Double>> B = new ArrayList<>();
            for (int i = 0; i < n2; i++) {
                ArrayList<Double> row = new ArrayList<>();
                for (int j = 0; j < m2; j++) {
                    row.add(scanner.nextDouble());
                }
                B.add(row);
            }
            if (n1 != n2 || m1 != m2) {
                System.out.println("Invalid input");
                return;
            }
            for (int i = 0; i < n1; i++) {
                for (int j = 0; j < m1; j++) {
                    double sum = A.get(i).get(j) + B.get(i).get(j);
                    System.out.print(sum + " ");
                }
                System.out.println();
            }
        }
    }
